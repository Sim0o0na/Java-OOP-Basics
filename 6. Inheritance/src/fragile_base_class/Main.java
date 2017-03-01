package fragile_base_class;

/**
 * Created by Sim0o on 2/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        Predator predator = new Predator();
        Food foods = new Food();
        predator.feed(foods);
    }
}
