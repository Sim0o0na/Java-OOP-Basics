package pizza_calories;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Simona Simeonova on 25-Feb-17.
 */
public class Pizza {
    private String name;
    private Dough dough;
    private HashSet<Topping> toppings;

    public Pizza(String name, Dough dough){
        this.setName(name);
        this.setDough(dough);
        this.toppings = new HashSet<>();
    }

    public double getCalories(){
        double calories = 0.0;
        for(Topping topping:this.getToppings()){
            calories+=topping.calculateCalories();
        }
        calories+=this.getDough().calculateCalories();
        return calories;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setDough(Dough dough){
        this.dough = dough;
    }

    public Dough getDough(){
        return this.dough;
    }

    public void addToping(Topping topping){
        this.getToppings().add(topping);
    }

    public HashSet<Topping> getToppings(){
        return this.toppings;
    }

}
