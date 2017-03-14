package centers;

import animals.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sim0o on 3/10/2017.
 */
public abstract class Center {
    private String name;
    private List<Animal> animals;

    public Center(String name){
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public List<Animal> getAnimals(){
        return this.animals;
    }
}
