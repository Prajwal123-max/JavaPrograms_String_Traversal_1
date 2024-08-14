package com;

import java.util.Scanner;

public class AlphaNumericCount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String:");
		String st=s.nextLine();
		
		alphaNumericCount(st);
	}
	public static void alphaNumericCount(String st) {
		int count=0;
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')) {
				count++;
				System.out.print(ch+" ");
			}
		}
		System.out.println("\nCount of AlphaNumeric Character count is: "+count);
	}

}
