package Javademo;

import java.util.Scanner;

public class PrintnLines {

	public static void main(String[] args) {
		
		
	        Scanner scan=new Scanner(System.in);
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	 int ln=1;
	 while(scan.hasNext()) {
	     String line=scan.nextLine();
	     System.out.println(ln +" "+line);
	     ln++;
	 
	 }
	 scan.close();
	   

	}

}
