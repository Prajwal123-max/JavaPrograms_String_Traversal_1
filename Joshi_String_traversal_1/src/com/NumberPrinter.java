package com;

import java.util.Scanner;

public class NumberPrinter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String:");
		String st=s.nextLine();
		
		numberPrinter(st);
	}
	public static void numberPrinter(String st) {
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>='0'&& ch<='9') {
				System.out.print(ch+" ");
			}
		}
	}

}
