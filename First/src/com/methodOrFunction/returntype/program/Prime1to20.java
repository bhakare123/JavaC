package com.methodOrFunction.returntype.program;

import java.util.Scanner;

public class Prime1to20 
{
   public static boolean isPrime(int num)
   {
	   int count =0;
	   for(int i=1;i<=num;i++)
	   {
		   if(num%i==0)
			   count++;
	   }
	   
	   return count ==2;
   }
   
   public static void printPrime(int start , int end)
   {
	   for(int i=start; i<=end ;i++)
	   {
		   if(isPrime(i))
			   System.out.println(i);
	   }
	   
   }
   
   public static void main(String[] args) 
   {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter a Starting Range ");
	  int str = sc.nextInt();
	  
	  System.out.println("Enter a ending Range ");
	  int end = sc.nextInt();
	  
	  printPrime(str,end);
	  
   }
}
