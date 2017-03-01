package pokemon_trainer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Simona Simeonova on 24-Feb-17.
 */
public class Trainer {

    private String name;
    private int badges;
    private HashSet<Pokemon> pokemons;

    public Trainer(String name){
        this.name = name;
        this.pokemons = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void removePokemon(Pokemon pokemon){
        this.pokemons.remove(pokemon);
    }
    public void setPokemons(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    public HashSet<Pokemon> getPokemons() {
        return pokemons;
    }

    public void addPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    public boolean hasPokemon(Pokemon pokemon){
        if(this.pokemons.contains(pokemon)){
            return true;
        }
        return false;
    }

    public int getBadges(){
        return this.badges;
    }

    public int increaseBadges(){
        return this.badges+=1;
    }

    public void decreasePokemonHealth(String pokemonName){
        this.pokemons.forEach(p -> {p.decreaseHealth();
            if (p.getHealth()<=0) {
                this.pokemons.remove(p);
            }});
    }

    @Override
    public String toString(){
        return String.format("%s %s %s", this.getName(), this.getBadges(), this.getPokemons().size());
    }
}
