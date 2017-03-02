package animals;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class Cat extends Animal {
    public Cat(String name, int age, String gender){
        super(name, age, gender);
    }

    @Override
    protected String produceSound(){
        return "MiauMiau";
    }
}
