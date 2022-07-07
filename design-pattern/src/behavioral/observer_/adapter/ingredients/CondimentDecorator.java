package behavioral.observer_.adapter.ingredients;

import behavioral.observer_.adapter.coffees.Beverage;

/**
 * @author hucc
 * 2022/7/7 21:55
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
