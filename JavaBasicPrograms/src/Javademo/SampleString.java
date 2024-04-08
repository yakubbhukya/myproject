package Javademo;

import java.util.Scanner;

public class SampleString {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        Double d=scan.nextDouble();
	        scan.nextLine();
	                // Write your code here
	        String strValue= scan.nextLine();
	        StringBuffer output= new StringBuffer();
	        output.append("String: ").append(strValue);
	        System.out.println(output.toString());
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }

	}


