package Pizzas;

import AbstractClasses.BasePizza;
import AbstractClasses.ToppingAddOn;

public class VeggiesWithMushPizza extends ToppingAddOn {
    private BasePizza pizza;

    public VeggiesWithMushPizza(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return this.pizza.price()+40;
    }
}
