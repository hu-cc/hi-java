package behavioral.observer_.adapter.ingredients;

import behavioral.observer_.adapter.coffees.Beverage;

/**
 * @author hucc
 * 2022/7/7 22:05
 */
public class Whip extends CondimentDecorator {

    private String description = "Whip";
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + this.description;
    }
}
