package com.practice;

import java.util.Scanner;

public class Practice11 {
	
	public static void main(String[] args) {
		
	System.out.println("enter number>>");
	Scanner scanner =  new Scanner(System.in);
	int num = scanner.nextInt();
	int rem ;
	int rev=0;
	int c = num;
	while(num>0) {
		
		rem = num%10;
		rev=(rem*rem*rem)+rev;
	}
	if(c==rev)	{
		System.out.println("amstrong");
	}else {
		System.out.println("not");
	}
	System.out.println("this is my fisrt program");
	System.out.println("but changes can be happning");
		
		
		
		
		
		
		
		
	}
	

}
