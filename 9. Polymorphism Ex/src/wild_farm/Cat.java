package wild_farm;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Sim0o on 3/7/2017.
 */
public class Cat extends Felime<Food> {
    private String breed;
    public Cat(String name, double weight, String livingRegion, String breed){
        super(name, weight);
        this.setLivingRegion(livingRegion);
        this.setBreed(breed);
    }
    protected void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    @Override
    protected void makeSound(){
        System.out.println("Meowwww");
    }
    @Override
    protected void eatFood(Food food){
            this.setFoodEaten(this.getFoodEaten()+food.getQuantity());
    }
    @Override
    public String toString(){
        NumberFormat formatter = new DecimalFormat("0.######");
        return String.format("Cat[%s, %s, %s, %s, %s]", this.getName(), this.getBreed(),
                formatter.format(this.getWeight()),
                this.getLivingRegion(), this.getFoodEaten());
    }
}
