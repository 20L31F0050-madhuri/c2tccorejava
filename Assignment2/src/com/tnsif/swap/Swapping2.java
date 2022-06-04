package com.tnsif.swap;

import java.util.Scanner;

public class Swapping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter any two numbers to swap");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping "+a+" and "+b);
		//System.out.println("the value of a is:"+a);
		//System.out.println("the value of b is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping "+a+" and "+b);
		//System.out.println("the value of a is:"+a);
		//System.out.println("the value of b is:"+b);

	}

}
