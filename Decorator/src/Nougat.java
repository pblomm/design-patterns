/**
 * @author Pascal Blomme
 * @version 1.0 25/06/2019 17:57
 */
public class Nougat extends CondimentDecorator {
    Beverage beverage;

    public Nougat(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", nougat";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
