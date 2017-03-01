package hierarchial_inheritance;

/**
 * Created by Sim0o on 2/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
