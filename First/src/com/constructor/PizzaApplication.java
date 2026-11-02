package com.constructor;

public class PizzaApplication 
{
   String szie ;
   boolean extraChees;
   int quentity;
   
   PizzaApplication()
   {
	   this("Midium");
   }
   PizzaApplication(String size)
   {
	   this(size, false);
	 
   }
   PizzaApplication(String size, boolean extraChees)
   {
	   this(size , extraChees, 1);
   }
   PizzaApplication(String size, boolean extraChees,int quentity)
   {
	   this.szie = size;
	   this.extraChees = extraChees;
	   this.quentity = quentity;
   }
   
   public void pizzaDetails()
   {
	   System.out.println("Pizza Size :- "+ szie);
	   System.out.println("Extara Cheese :- "+extraChees);
	   System.out.println("Quentity :- "+quentity);
   }
   
}
