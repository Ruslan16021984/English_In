package com.gmail.carbit3333333;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file = new File("charCounter.txt");
        try {
            file.createNewFile();
        }
        catch (IOException e){
            System.out.println(e);
        }
         try(BufferedWriter f = new BufferedWriter(new FileWriter(file))){
            f.write("Java is a programming language and computing platform first released by Sun Microsystems in 1995. " +
                    "There are lots of applications and websites that will not work unless you have Java installed, " +
                    "and more are created every day. Java is fast, secure, and reliable. From laptops to datacenters, " +
                    "game consoles to scientific supercomputers, cell phones to the Internet, Java is everywhere!");
        }
        catch(IOException e){
            System.out.println(e);
        }
         CharCounter.countCharFromFile("charCounter.txt");
    }

	

}
