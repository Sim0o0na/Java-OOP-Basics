package wild_farm;

/**
 * Created by Sim0o on 3/7/2017.
 */
public abstract class Mammal<T extends Food> extends Animal<T> {
    private String livingRegion;

    public Mammal(String animalName, double animalWeight) {
        super(animalName, animalWeight);
    }


    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }
}
