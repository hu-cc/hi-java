package behavioral.observer_.adapter.coffees;

/**
 * @author hucc
 * 2022/7/7 21:54
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();

}
