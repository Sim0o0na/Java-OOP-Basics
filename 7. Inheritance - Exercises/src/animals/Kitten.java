package animals;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class Kitten extends Animal{
    public Kitten(String name, int age, String gender){
        super(name, age, gender);
    }

    @Override
    protected String produceSound(){
        return "Miau";
    }
}
