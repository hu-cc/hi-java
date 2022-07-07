package behavioral.observer_.adapter.coffees;

/**
 * @author hucc
 * 2022/7/7 22:08
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
