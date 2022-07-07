package behavioral.observer_.adapter.ingredients;

import behavioral.observer_.adapter.coffees.Beverage;

/**
 * @author hucc
 * 2022/7/7 22:06
 */
public class Soy extends CondimentDecorator {

    private String description = "Soy";
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + this.description;
    }
}
