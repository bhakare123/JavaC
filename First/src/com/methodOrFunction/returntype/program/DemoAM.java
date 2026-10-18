package com.methodOrFunction.returntype.program;

import java.util.Scanner;

public class DemoAM 
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	public static int mod(int a,int b)
	{
		return a%b;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2 ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter choice 1.Add 2.Sub 3.Mul 4.div 5.mod");
		int cho = sc.nextInt();
		
		switch(cho)
		{
		 case 1 :
			 System.out.println("Addtion = "+add(num1,num2)); 
			 break;
		 case 2:
			 System.out.println("Substraction "+sub(num1,num2));
			 break;
		 case 3 :
			 System.out.println("Multi "+mul(num1,num2));
			 break;
		 case 4 :
			 if(num2 ==0)
				 System.out.println("not posible by zer0");
			 else
			     System.out.println("Div "+div(num1,num2));
			 break;
		 case 5:
			 System.out.println("mod "+mod(num1,num2));
			  break;
		  default:
			  System.out.println("Invalid Input");
		}
		
	}

}
