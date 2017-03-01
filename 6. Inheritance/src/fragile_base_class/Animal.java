package fragile_base_class;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sim0o on 2/28/2017.
 */
public class Animal {
    protected List<Food> foodEaten;

    public Animal(){
        this.foodEaten = new ArrayList<>();
    }
    public final void eat(Food food){
        this.foodEaten.add(food);
    }

    public final void eatAll(Food[] foods){
        for (Food food:foods) {
            this.eat(food);
        }
    }

}
