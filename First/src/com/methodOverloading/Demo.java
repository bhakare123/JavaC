package com.methodOverloading;

public class Demo 
{
	public static void demo()
	{
		System.out.println("Demo 1");
	}
	public static void demo(int a)
	{
		System.out.println("Demo 2");
	}
	public static void demo(double a)
	{
		System.out.println("Demo 3");
	}
    public static void demo(double a , char ch)
    {
    	System.out.println("Demo 4");
    }
    public static void demo(char ch , double d)
    {
    	System.out.println("Demo 5");
    }
    
    public static void main(String[] args) 
    {
		demo();
		demo(10);
		demo(20.4);
		demo('H', 20.24);
		demo(20.44, 'A');
	}
}
