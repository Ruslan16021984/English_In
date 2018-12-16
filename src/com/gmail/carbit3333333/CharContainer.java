package com.gmail.carbit3333333;

public class CharContainer{
	private char c;
	private int count = 1;

	public CharContainer(char c) {
		super();
		this.c = c;
	}

	public char getC() {
		return c;
	}
	public void iterCount() {
		this.count++;
	}


	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "CharContainer c= " + c + " , count= " + count + "\n"+"";
	}
	

	
}
