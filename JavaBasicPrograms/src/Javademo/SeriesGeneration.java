package Javademo;

import java.util.Scanner;

public class SeriesGeneration {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            generateSeries(a,b,n);
	        }
	        in.close();
	    }
	    private static void generateSeries(int a, int b, int n){
	        int sum =a;
	        for(int i=0;i<n;i++) {
	            sum += (int)(Math.pow(2,i)*b);
	            System.out.print(sum+" ");
	        }
	        System.out.println();
	    }
	
	}


