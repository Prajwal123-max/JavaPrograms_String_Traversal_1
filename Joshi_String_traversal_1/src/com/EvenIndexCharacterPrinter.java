package com;

import java.util.Scanner;

public class EvenIndexCharacterPrinter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string:");
		String st=s.nextLine();
		
		for(int i=0; i<st.length(); i=i+2) {
			char ch=st.charAt(i);
			System.out.print(ch+" ");
		}
	}

}
