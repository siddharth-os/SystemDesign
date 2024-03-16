import AbstractClasses.BasePizza;
import Pizzas.MargheritaPizza;
import Pizzas.MushroomPizza;
import Pizzas.VeggiesAndMargPizza;
import Pizzas.VeggiesWithMushPizza;

public class Main {
    public static void main(String[] args) {
        BasePizza mushroom = new MushroomPizza();
        BasePizza veggiesWithMush = new VeggiesWithMushPizza(new MushroomPizza());
        BasePizza mocktailPizza = new VeggiesAndMargPizza(new MargheritaPizza());

        System.out.println(mushroom.price());
        System.out.println(veggiesWithMush.price());
        System.out.println(mocktailPizza.price());
    }
}