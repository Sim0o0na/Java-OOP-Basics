package wild_farm;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Sim0o on 3/7/2017.
 */
public class Tiger extends Felime<Meat> {
    public Tiger(String name, double weight, String livingRegion){
        super(name, weight);
        this.setLivingRegion(livingRegion);
    }
    @Override
    protected void makeSound(){
        System.out.println("ROAAR!!!");
    }
    @Override
    protected void eatFood(Meat food){
        if (!food.getClass().getSimpleName().equals("Meat")) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + "s are not eating that type of food!");
        }
        this.setFoodEaten(this.getFoodEaten()+food.getQuantity());
    }
    @Override
    public String toString(){
        NumberFormat formatter = new DecimalFormat("0.######");
        return String.format("Tiger[%s, %s, %s, %s]", this.getName(),
                formatter.format(this.getWeight()),
                this.getLivingRegion(), this.getFoodEaten());
    }
}
