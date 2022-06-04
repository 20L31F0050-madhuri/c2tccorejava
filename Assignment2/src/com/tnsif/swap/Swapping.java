package com.tnsif.swap;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		int a,b,temp=0;
		System.out.println("Enter any two numbers to swap");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		

	}

}
