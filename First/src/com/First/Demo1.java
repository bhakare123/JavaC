package com.First;

import java.util.Scanner;
public class Demo1 
{
  public static void main(String args[])
  {
	 
	   char cho ;
	   Scanner sc = new Scanner(System.in);
	   
	   do
	   {
		  System.out.println("Do u Love me?");
		  System.out.println("Y/N");
		  cho = sc.next().charAt(0);
		  
	   }while(cho == 'Y' && cho == 'N' && cho == 'y' && cho == 'n');
	   
	   System.out.println("I also Love u");
	   
  }
}
