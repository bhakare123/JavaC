package com.methodOrFunction.returntype.program;

import java.util.Scanner;

public class PrimeOrNot 
{
   public static boolean isPrime(int num)
   {
	   if(num ==0 || num ==1)
		   return false;
	   
	   int count =0;
	   for (int i=1; i<=num; i++)
	   {
		   if(num%i==0)
		   {
			   count++;
		   }
	   }
	   
	   return count == 2;
   }
   
   public static void main(String[] args) 
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enetr a Number :- ");
	 int num1 = sc.nextInt();
	 
	 if(isPrime(num1))
		 System.out.println("Prime Number");
	 else
		 System.out.println("Not Prime");
   }
} 
