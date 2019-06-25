/**
 * @author Pascal Blomme
 * @version 1.0 24/06/2019 15:49
 */
public class Espresso extends Beverage {
    public Espresso() {
        this.description = "espresso";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
