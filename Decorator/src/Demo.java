import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Pascal Blomme
 * @version 1.0 24/06/2019 15:23
 */
public class Demo {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee = new Milk(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());

        try {
            LowerCaseInputStream lcis = new LowerCaseInputStream(new FileInputStream("bestand.txt"));

            int c;
            while ((c = lcis.read()) >= 0) {
                System.out.print((char) c);
            }
            lcis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
