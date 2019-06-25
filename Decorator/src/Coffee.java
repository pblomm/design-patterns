/**
 * @author Pascal Blomme
 * @version 1.0 24/06/2019 15:19
 */
public class Coffee extends Beverage {
    public Coffee() {
        this.description = "coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
