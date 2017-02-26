package pokemon_trainer;

/**
 * Created by Simona Simeonova on 24-Feb-17.
 */
public class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String n, String e, int h){
        this.name = n;
        this.element = e;
        this.health = h;
    }

    public int decreaseHealth(){
        return this.health-=10;
    }

    public int getHealth(){
        return this.health;
    }
    public String getName(){
        return this.name;
    }

    public String getElement(){
        return this.element;
    }
}
