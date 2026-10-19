package com.methodRecursion;

//Stack Overflow Error    Example of InDirect Recursion


public class Demo2 
{
  public static void main(String[] args)  
  {
	System.out.println("Main Method");
	Java();
  }
  public static void Java()
  {
	  System.out.println("Java Method");
	  main(null);
  }
}
