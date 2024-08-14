package com;

import java.util.Scanner;

public class UpperCaseCharacterCount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String:");
		String st=s.nextLine();
		
		upperCaseCount(st);
	}
	public static void upperCaseCount(String st) {
		int count=0;
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
