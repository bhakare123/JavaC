package com.methodOrFunction.returntype.program;

import java.util.Scanner;

public class PerfectNumber1to100 
{
	public static boolean isPerfectnum(int num)
	{
		int sum =0;
		
		for (int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		
		return sum == num;
	}
	
	public static void printPerfectnum(int str, int end)
	{
		for(int i =str; i<=end;i++)
		{
			if(isPerfectnum(i))
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Starting range : ");
		int str = sc.nextInt();
		System.out.println("Enter a Ending range :");
		int end = sc.nextInt();
		
		printPerfectnum(str,end);
		
	}

}
