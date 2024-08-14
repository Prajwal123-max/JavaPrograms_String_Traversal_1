package com;

import java.util.Scanner;

public class VowelCountInString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st=s.nextLine();
		
		vowelCount(st);
	}
	public static void vowelCount(String st) {
		int count=0;
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				System.out.print(ch+" ");
			}
		}
		System.out.println("\nCount of Vowels in this String is: "+count);
	}

}
