package com.methodOverloading;

public class Demo1 
{
   public static void sample()
   {
	   System.out.println("Static Method ");
   }
   public static char sample(char ch)
   {
	  System.out.println("Static returntype Method");
	  return ch;
   }
   public void sample(int a)
   {
	   System.out.println("Non static method");
   }
   private void sample(double a)
   {
	   System.out.println("Private Method ");
   }
   public final void sample(double a,int b)
   {
	   System.out.println("Final method ");
   }
   
   public static void main(String[] args) 
   {
	   sample();
	   sample('c');
	   Demo1 sc = new Demo1();
	   sc.sample(10.20);
	   sc.sample(10.20, 'A');
	   sc.sample(10);
	   
   }
}
