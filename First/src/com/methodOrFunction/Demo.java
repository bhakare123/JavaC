package com.methodOrFunction;

import java.util.Scanner;

public class Demo 
{
  public static void main(String[] args) 
  {
	System.out.println("Main Method Started");
	personalDetails();
	System.out.println("Main Ended");
  }
  
  public static void personalDetails()
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Personal Details");
	  
	  System.out.println("Enter a Name :-> ");
	  String name = sc.next();
	  
	  System.out.println("Enter a Age :-> ");
	  int age = sc.nextInt();
	  
	  System.out.println("Enter your phone no :-> ");
	  long phone = sc.nextLong();
	  
	  System.out.println("Enter your Address :-> ");
	  String add = sc.next();
	  
	  System.out.println("*******************************");
	  
	  System.out.println("Name = "+name);
	  System.out.println("Age = "+age);
	  System.out.println("Phone = "+phone);
	  System.out.println("Address = "+add);
	  
	  System.out.println("*******************************");
  }
}
