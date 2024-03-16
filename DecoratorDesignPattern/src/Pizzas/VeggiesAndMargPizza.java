package Pizzas;

import AbstractClasses.BasePizza;
import AbstractClasses.ToppingAddOn;

public class VeggiesAndMargPizza extends ToppingAddOn {
    private BasePizza pizza;

    public VeggiesAndMargPizza(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return this.pizza.price()+47;
    }
}
