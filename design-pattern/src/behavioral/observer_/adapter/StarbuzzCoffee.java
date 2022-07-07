package behavioral.observer_.adapter;

import behavioral.observer_.adapter.coffees.Beverage;
import behavioral.observer_.adapter.coffees.DarkRoast;
import behavioral.observer_.adapter.coffees.Espresso;
import behavioral.observer_.adapter.coffees.HouseBlend;
import behavioral.observer_.adapter.ingredients.Mocha;
import behavioral.observer_.adapter.ingredients.Soy;
import behavioral.observer_.adapter.ingredients.Whip;

/**
 * @author hucc
 * 2022/7/7 21:56
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
