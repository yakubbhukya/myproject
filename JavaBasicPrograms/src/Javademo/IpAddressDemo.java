package Javademo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IpAddressDemo {

	public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Website Name:");
	String website=sc.nextLine();
	try {
		InetAddress ip=InetAddress.getByName(website);
		System.out.println("The Ip address is:"+ip);
	} catch (Exception e) {
		
	System.out.println("Website is nopt found");
	}
	

	}

}
