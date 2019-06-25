/**
 * @author Pascal Blomme
 * @version 1.0 24/06/2019 17:03
 */
public class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        else if (type.equals("greek")) {
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
