package pokemon_trainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * Created by Simona Simeonova on 24-Feb-17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Trainer> trainers = new HashMap<>();
        while(true){
            String[] line = scan.readLine().split("\\s+");
            if(line[0].equals("Tournament")){
                break;
            }
            String trainerName = line[0];
            String pokemonName = line[1]; String pokemonElement = line[2]; int pokemonHealth = Integer.parseInt(line[3]);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement,pokemonHealth);
            if(!trainers.containsKey(trainerName)){
                Trainer trainer = new Trainer(trainerName);
                trainer.addPokemon(pokemon);
                trainers.put(trainerName,trainer);
            }else{
                trainers.get(trainerName).addPokemon(pokemon);
            }
        }

        trainers.values().forEach(System.out::println);
        System.out.println("----");

        while(true){
            String element = scan.readLine();
            if(element.equals("End")){
                break;
            }
            for(Trainer trainer:trainers.values()){
                long pokemonsWithElementCount =
                        trainer.getPokemons().stream().filter(pokemon -> pokemon.getElement().equals(element)).count();
                if(pokemonsWithElementCount>0){
                    trainer.increaseBadges();
                }else{
                    trainer.getPokemons()
                            .forEach(pokemon -> pokemon.decreaseHealth());
                    trainer.setPokemons(trainer.getPokemons().stream().
                            .filter(pokemon -> pokemon.getHealth() > 0)
                            .collect(Collectors.toSet()));
                }
            }
        }

        trainers.values().stream()
                .sorted((t1, t2) -> Integer.compare(t2.getBadges(), t1.getBadges()))
                .forEach(System.out::println);
    }
}
