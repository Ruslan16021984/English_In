package com.gmail.carbit3333333;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class CharCounter {
	public static void countCharFromFile(String fileName) {
		String txt = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
			while (true) {
				String s = reader.readLine();
				if(s == null) {
                    break;
                }
				txt = s;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		char[]array = txt.toCharArray();
		ArrayList<CharContainer> arrayList = new ArrayList<>();
		for (char c : array) {
			int i = isContain(arrayList, c);
			if (i >=0) {
				arrayList.get(i).iterCount();
			}else {
				arrayList.add(new CharContainer(c));
			}
		}
		Collections.sort(arrayList, (a, b)-> a.getCount()-b.getCount()>0 ? -1: 1);
		System.out.println(arrayList);
	}

	private static int isContain(ArrayList<CharContainer> arrayList, char c) {
		int result =-1;
		for (int i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i).getC()==c) {
				result = i;
				break;
			}
		}
	
		return result;
	}
	
}
