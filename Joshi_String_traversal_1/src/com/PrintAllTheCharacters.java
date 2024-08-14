package com;

import java.util.Scanner;

public class PrintAllTheCharacters {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String:");
		String st=s.nextLine();
		
		printingAllTheCharacters(st);
	}
	public static void printingAllTheCharacters(String st) {
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			System.out.println(ch);
		}
	}

}
