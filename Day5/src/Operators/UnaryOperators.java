package Operators;

public class UnaryOperators
{

	public static void main(String[] args)
	{
		int a=8;
		int b=a;
		System.out.println("before incrementing"+b);
		int b1=a++;
		System.out.println("after post incrementing"+b1);
		int c=b1;
		System.out.println("before decrementing"+c);
		int c1=b1--;
		System.out.println("after post decrement"+c1);
		int d=a;
		System.out.println("before pre incrementing"+d);
		int d1=++a;
		System.out.println("after pre incrementing"+d1);
		int e=a;
		System.out.println("before pre decrementing"+e);
		int e1=--a;
		System.out.println("after pre incrementing"+e1);
		
	}

}
