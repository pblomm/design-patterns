/**
 * @author Pascal Blomme
 * @version 1.0 24/06/2019 17:00
 */
public class PizzaStore {
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public void orderPizza(String type) {
        Pizza pizza = null;

        pizza = factory.createPizza(type);
        System.out.println("pizza ordered");
    }
}
