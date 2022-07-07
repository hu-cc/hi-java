package behavioral.observer_.adapter.ingredients;

import behavioral.observer_.adapter.coffees.Beverage;

/**
 * @author hucc
 * 2022/7/7 22:03
 */
public class Mocha extends CondimentDecorator {

    private String description = "Mocha";
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", " + this.description;
    }

}
