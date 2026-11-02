package com.constructor;

public class PizzaC 
{
	   String pizzaSize;
	   boolean extraCheese;
	   int quantity;
	   
	   PizzaC(String pizzaSize)
	   {
		 this.pizzaSize = pizzaSize;
		 System.out.println("Pizza Size = "+ pizzaSize);
	   } 
	   
	   PizzaC(String pizzaSize, boolean extraCheese)
	   {
		   this("Midium");
		   this.pizzaSize = pizzaSize;
		   this.extraCheese = extraCheese;
		   
		   System.out.print("Pizza Size = "+pizzaSize+" ,");
		   System.out.println(" Pizza Extracheese = "+extraCheese+" ,");
	   }
	   
	   PizzaC(String pizzaSize, boolean extraCheese, int quantity)
	   {
		   this("Large",true);
		   this.pizzaSize = pizzaSize;
		   this.extraCheese = extraCheese;
		   this.quantity = quantity;
		   
		   System.out.print("Pizza Size = "+pizzaSize+" ,");
		   System.out.print(" Pizza Extracheese = "+extraCheese+" ,");
		   System.out.println(" Quantity = "+quantity);
	   }
	   
}
