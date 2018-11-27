package com.company;

public class Trio implements MenuItem
{
  Sandwich sandwich;
  Salad salad;
  Drink drink;
    public Trio(Sandwich sandwich,Salad salad,Drink drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName()
    {
        return sandwich.getName()+ "/"+ salad.getName()+"/"+drink.getName();
    }
    public double getPrice()
    {
        double Price = 0;
        if (sandwich.getPrice() > salad.getPrice() && drink.getPrice() > salad.getPrice())
        {
            Price = sandwich.getPrice() + drink.getPrice();
        }
        if (salad.getPrice() > sandwich.getPrice() && drink.getPrice() > sandwich.getPrice())
        {
            Price = sandwich.getPrice() + drink.getPrice();
        }
        if (sandwich.getPrice() > salad.getPrice() && drink.getPrice() > salad.getPrice())
        {
            Price = sandwich.getPrice() + drink.getPrice();
        }if (sandwich.getPrice() > drink.getPrice() && salad.getPrice() > drink.getPrice())
    {
        Price = sandwich.getPrice() + salad.getPrice();
    }
        return Price;
    }
    public String toString()
    {
        String out
    }
}
