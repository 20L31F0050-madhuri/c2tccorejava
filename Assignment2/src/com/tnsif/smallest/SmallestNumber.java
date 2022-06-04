package com.tnsif.smallest;
import java.util.Scanner; 
class Number
{
	void smallest(int a,int b, int c)
	{
		if(a<b&&a<c)
		{
			System.out.println(+a+" is smaller than "+b+" and "+c);
		}
		else if(b<a&&b<c)
		{
			System.out.println(+b+" is smaller than "+a+" and "+c);
		}
		else
			System.out.println(+c+" is smaller than "+a+" and "+b);
	}
	}

public class SmallestNumber
{

	public static void main(String[] args)
	{
		Number num=new Number();
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		num.smallest(a, b, c);
	}

}
