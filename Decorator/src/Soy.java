/**
 * @author Pascal Blomme
 * @version 1.0 24/06/2019 15:21
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
