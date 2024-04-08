package Javademo;

import java.util.Scanner;

public class ReverseStringDemo {
	public static void reverseString(char [] ch,int length) {
		if(length>0) {
			System.out.print(ch[length-1]);
			length--;
			reverseString(ch,length); // recursive method
		
		}
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
			System.out.println("Enter String");
			String str=sc.nextLine();
			char[] ch=str.toCharArray(); // convert the string value into the Character Array
			int length= ch.length;  // finding the length of String
			reverseString(ch,length);
	
	}

}
