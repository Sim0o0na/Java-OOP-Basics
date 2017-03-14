package animals;

/**
 * Created by Sim0o on 3/9/2017.
 */
public abstract class Animal {
    private String name;
    private int age;
    private String cleansingStatus;
    private String adoptionCenter;

    public Animal(String name, int age, String cleansingStatus, String adoptionCenter) {
        this.name = name;
        this.age = age;
        this.cleansingStatus = cleansingStatus;
        this.adoptionCenter = adoptionCenter;
    }
}
