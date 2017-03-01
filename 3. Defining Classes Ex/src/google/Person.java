package google;
import java.util.*;

/**
 * Created by Sim0o0na on 2/28/2017.
 */
public class Person {
    private String name;
    private Company company;
    private Car car;
    private LinkedHashSet<Parent> parents;
    private LinkedHashSet<Child> children;
    private LinkedHashSet<Pokemon> pokemonList;


    public Person(String name){
        this.setName(name);
        this.parents = new LinkedHashSet<>();
        this.children = new LinkedHashSet<>();
        this.pokemonList = new LinkedHashSet<>();
    }

    public Company getCompany() {
        return company;
    }
    public LinkedHashSet<Pokemon> getPokemonList(){
        return this.pokemonList;
    }

    public LinkedHashSet<Child> getChildren(){
        return this.children;
    }

    public LinkedHashSet<Parent> getParents(){
        return this.parents;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }

    public void addParent(Parent parent) {
        this.parents.add(parent);
    }

    public void addChild(Child child) {
        this.children.add(child);
    }
}
