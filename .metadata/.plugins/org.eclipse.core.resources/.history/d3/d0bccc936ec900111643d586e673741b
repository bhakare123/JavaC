package com.methodOrFunction.returntype.program;

import java.util.Scanner;

public class Palindrom 
{
   public static int isPalindrm(int num)
   {
	   int rev =0;
	   
	   while(num!=0)
	   {
		   int rem = num%10;
		   rev = rev*10+rem;
		   num/=10;
	   }
	   
	   return rev;
   }
   
   public static boolean IsCheck(int num , int reves)
   {
	   return num == reves;
   }
   
   public static void main(String[] args) 
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number :- ");
	  
	  int num = sc.nextInt();  
	  int rev = isPalindrm(num);
	  
	  if(IsCheck(num,rev))
		  System.out.println("Palindrom");
	  else
		  System.out.println("Not Palindrom");
	
   }
}
