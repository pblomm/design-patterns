/**
 * @author Pascal Blomme
 * @version 1.0 25/06/2019 17:54
 */
public class Sugar extends CondimentDecorator {
    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", sugar";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.25;
    }
}
