package animals;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class Tomcat extends Animal {
    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected String produceSound() {
        return "Give me one million b***h";
    }
}
