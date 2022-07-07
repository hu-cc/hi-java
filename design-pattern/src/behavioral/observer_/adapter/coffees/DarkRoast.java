package behavioral.observer_.adapter.coffees;

/**
 * @author hucc
 * 2022/7/7 21:58
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }

}
