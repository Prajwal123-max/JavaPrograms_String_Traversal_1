package com;

import java.util.Scanner;

public class AplhabeticCharacterPrinter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String:");
		String st=s.nextLine();
		
		alphabeticCharacterPrinter(st);
	}
	public static void alphabeticCharacterPrinter(String st) {
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
				System.out.print(ch+" ");
			}
		}
	}

}
