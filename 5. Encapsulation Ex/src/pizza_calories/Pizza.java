package pizza_calories;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;

/**
 * Created by Simona Simeonova on 25-Feb-17.
 */
public class Pizza {
    private String name;
    private Dough dough;
    private HashSet<Topping> toppings;
    private int numberOfToppings;
    private double totalCalories;

    public Pizza(){
        this.toppings = new HashSet<>();
    }
    public Pizza(String name, int numberOfToppings){
        this.setName(name);
        this.setnumberOfToppings(numberOfToppings);
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
        if(!name.equals("") && !(name.length()>=1) && !(name.length()<=15)){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }
    public String getName(){
       return this.name;
    }

    public int getnumberOfToppings(){
        return this.numberOfToppings;
    }

    public void setnumberOfToppings(int num){
        if (num < 0 || num > 10)
        {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.numberOfToppings = num;
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
