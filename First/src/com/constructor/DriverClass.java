package com.constructor;

public class DriverClass 
{
  public static void main(String[] args) 
  {
	PizzaApplication p = new PizzaApplication();
	p.pizzaDetails();
	System.out.println("------------------------");
	
	PizzaApplication p1 = new PizzaApplication("Large");
	p1.pizzaDetails();
	System.out.println("------------------------");
	
	PizzaApplication p2 = new PizzaApplication("Large",true);
	p2.pizzaDetails();
	System.out.println("-------------------------");
	
	PizzaApplication p3 = new PizzaApplication("Small", false, 4);
	p3.pizzaDetails();
  }
}
