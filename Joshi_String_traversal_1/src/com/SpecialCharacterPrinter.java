package com;

import java.util.Scanner;

public class SpecialCharacterPrinter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String:");
		String st=s.nextLine();
		
		specialCharacterPrinter(st);
	}
	public static void specialCharacterPrinter(String st) {
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(!(ch>='A'&&ch<='Z')&&!(ch>='a'&&ch<='z')&&!(ch>='0'&&ch<='9')&& ch!=' ')
			{
				System.out.print(ch+" ");
			}
		}
	}

}
