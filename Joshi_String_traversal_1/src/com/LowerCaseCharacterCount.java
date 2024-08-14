package com;

import java.util.Scanner;

public class LowerCaseCharacterCount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String:");
		String st=s.nextLine();
		
		lowerCaseCount(st);
	}
	public static void lowerCaseCount(String st) {
		int count=0;
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>='a'&&ch<='z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
