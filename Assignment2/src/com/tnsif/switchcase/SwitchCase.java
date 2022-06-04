package com.tnsif.switchcase;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		 String choice="";
		System.out.println("january february march april may june july august september october november december");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		choice=sc.next();
		switch(choice)
		{
		case "january":System.out.println("number of days is 31");
						break;
		case "february":System.out.println("number of days is 29");
		                break;
		case "march":System.out.println("number of days is 31");
						break;
		case "april":System.out.println("number of days is 30");
						break;
		case "may":System.out.println("number of days is 31");
						break;
		case "june":System.out.println("number of days is 30");
						break;
		case "july":System.out.println("number of days is 31");
						break;
		case "august":System.out.println("number of days is 31");
						break;
		case "september":System.out.println("number of days is 30");
						break;
		case "october":System.out.println("number of days is 31");
						break;
		case "november":System.out.println("number of days is 30");
						break;
		case "december":System.out.println("number of days is 31");
						break;
				
		}}

}
