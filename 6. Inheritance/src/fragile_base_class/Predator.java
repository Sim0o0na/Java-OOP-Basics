package fragile_base_class;

/**
 * Created by Sim0ona on 2/28/2017.
 */
public class Predator extends Animal {
    private int health;
    public void feed(Food food){
        super.eat(food);
        this.health++;
    }
    public void feedAll(Food[] foods){
        for (Food food:foods){
            super.eat(food);
        }
        this.health+=foods.length;
    }
}
