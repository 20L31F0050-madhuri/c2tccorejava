package com.tnsif.multiplication;
import java.util.*;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.println("multipication table is:\n");

		for(int i = 1; i <= 10; i++)
        {
			int res=number*i;
            System.out.printf(+number+"*"+i+"="+res);
            System.out.println("\n");
        }
	}

}
