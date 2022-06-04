package com.tnfif.possitive;
import java.util.*;
public class Check {

	public static void main(String[] args) {
		int number;
		System.out.println("enter any number to check whether it is possitive or negative");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		if(number==0)
		{
			System.out.println(+number+" is zero");
		}
			else if(number>0)
			{
				System.out.println(+number+" is possitive number");
				
			}
			else
				System.out.println(+number+" is negative number");
	}
	

}
