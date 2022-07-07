package behavioral.observer_.adapter.ingredients;

import behavioral.observer_.adapter.coffees.Beverage;

/**
 * @author hucc
 * 2022/7/7 22:01
 */
public class Milk extends CondimentDecorator {

    private String description = "Milk";
    private Beverage beverage;

    public Milk(Beverage beverage) {
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
