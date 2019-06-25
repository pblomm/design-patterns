/**
 * @author Pascal Blomme
 * @version 1.0 25/06/2019 17:56
 */
public class Honey extends CondimentDecorator {
    Beverage beverage;

    public Honey(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", honey";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.50;
    }
}
