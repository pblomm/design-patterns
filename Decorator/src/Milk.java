/**
 * @author Pascal Blomme
 * @version 1.0 24/06/2019 15:21
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
