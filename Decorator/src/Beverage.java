/**
 * @author Pascal Blomme
 * @version 1.0 24/06/2019 15:07
 */
public abstract class Beverage {
    String description;

    Beverage() {
        this.description = "beverage";
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
