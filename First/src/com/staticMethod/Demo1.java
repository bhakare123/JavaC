package com.staticMethod;

public class Demo1 
{
   int a ;
   static int b = 10;
   
   Demo1()
   {
	   System.out.println("AAAAAAAAAA");
	   System.out.println(a);
   }
   
   public static void m1()
   {
	   Demo1 d = new Demo1();
	   System.out.println(d.a);
	   System.out.println(b);
   }
   
   {
	   System.out.println("Shree");
   }
   
   static 
   {
	   System.out.println("The");
   }  
}
