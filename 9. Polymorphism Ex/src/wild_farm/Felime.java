package wild_farm;

/**
 * Created by Sim0o on 3/7/2017.
 */
public abstract class Felime<T extends Food> extends Mammal<T> {

    public Felime(String animalName, double animalWeight) {
        super(animalName, animalWeight);
    }
}
