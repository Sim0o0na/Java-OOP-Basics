package wild_farm;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Sim0o on 3/7/2017.
 */
public class Mouse extends Mammal {
    public Mouse(String name, double weight, String livingRegion){
        super(name, weight);
        this.setLivingRegion(livingRegion);
    }
    @Override
    protected void makeSound(){
        System.out.println("SQUEEEAAAK!");
    }
    @Override
    protected void eatFood(Food food){
        if (!food.getClass().getSimpleName().equals("Vegetable")) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + "s are not eating that type of food!");
        }
        if (food.getQuantity() == 0) {
            throw new IllegalArgumentException("A cheese was just eaten!");
        }
        this.setFoodEaten(this.getFoodEaten()+food.getQuantity());
    }
    @Override
    public String toString(){
        NumberFormat formatter = new DecimalFormat("0.######");
        return String.format("Mouse[%s, %s, %s, %s]", this.getName(),
                formatter.format(this.getWeight()),
                this.getLivingRegion(), this.getFoodEaten());
    }
}
