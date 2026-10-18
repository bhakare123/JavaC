package com.methodOverloading;

import java.util.Scanner;

public class Instagram 
{
   public static void Login(String username, String Password)
   {
	   System.out.println("Login Successful by username, password");
   }
   public static void Login(String email, int otp)
   {
	   System.out.println("Login Successful by Email, OTP");
   }
   public static void Login(long phone, int otp)
   {
	   System.out.println("Login Successful by PhoneNo , OTP");
   }
   
   public static void main(String[] args) 
   {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a Choic");
	  System.out.println("1. UserName & Password \n2. Email & OTP \n3. PhoneNo & OTP");
	  int choice = sc.nextInt();
	  
	  switch(choice)
	  {
	    case 1:
	    {
	    	System.out.println("Enter a UserName :-");
	    	String username = sc.next();
	    	System.out.println("Enter a Password :-");
	    	String password = sc.next();
	    	
	    	Login(username, password);
	    }
	    
	    case 2:
	    {
	    	System.out.println("Enter a Email");
	    	String email = sc.next();
	    	System.out.println("Enter a OTP");
	    	int otp = sc.nextInt();
	    	
	    	Login(email,otp);
	    }
	    case 3:
	    {
	    	System.out.println("Enter a Mobile No");
	    	long mobile = sc.nextLong();
	    	System.out.println("Enter a OTP");
	    	int otp = sc.nextInt();
	    	
	    	Login(mobile, otp);
	    }
	  }
	  
   }
}
