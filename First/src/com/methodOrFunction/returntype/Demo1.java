package com.methodOrFunction.returntype;

public class Demo1 
{
  public static void main(String[] args) 
  {
	//System.out.println("Result = "+Add());
	  int res = Add();
	  System.out.println("Result = "+res);
  }
  
  public static int Add()
  {
	  int a =10, b=20;
	  
	  return a+b;
  }
}
