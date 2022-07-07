package behavioral.observer_.adapter.coffees;

/**
 * @author hucc
 * 2022/7/7 21:57
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
