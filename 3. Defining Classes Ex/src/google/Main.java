package google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;

/**
 * Created by Sim0o on 2/28/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Person> people = new HashMap<>();
        String command = reader.readLine();
        while(!command.equals("End")){
            String[] data = command.split("\\s+");
            String name = data[0];
            if(!people.containsKey(name)){
                people.put(name, new Person(name));
            }
            switch (data[1].toLowerCase()){
                case "company":
                    String companyName = data[2]; String department = data[3]; double salary = Double.parseDouble(data[4]);
                    Company company = new Company(companyName, department, salary);
                    people.get(name).setCompany(company);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(data[2], data[3]);
                    people.get(name).addPokemon(pokemon);
                    break;
                case "parents":
                    Parent parent = new Parent(data[2], data[3]);
                    people.get(name).addParent(parent);
                    break;
                case "children":
                    Child child = new Child(data[2], (data[3]));
                    people.get(name).addChild(child);
                    break;
                case "car":
                    Car car = new Car(data[2], Double.parseDouble(data[3]));
                    people.get(name).setCar(car);
                    break;

            }
            command = reader.readLine();
        }

        String nameToPrint = reader.readLine();
        if(people.containsKey(nameToPrint)) {
            PrintData(people, nameToPrint);
        }
    }

    private static void PrintData(HashMap<String, Person> people, String nameToPrint) {
        System.out.println(nameToPrint);
        if(people.get(nameToPrint).getCompany()!=null){
            System.out.println(people.get(nameToPrint).getCompany().toString());
        }else{
            System.out.println("Company:");
        }

        if(people.get(nameToPrint).getCar()!=null){
            System.out.println(people.get(nameToPrint).getCar().toString());
        }else{
            System.out.println("Car:");
        }
        System.out.println("Pokemon:");
        for (Pokemon pokemon : people.get(nameToPrint).getPokemonList()) {
            System.out.printf("%s %s\n", pokemon.getName(), pokemon.getType());
        }
        System.out.println("Parents:");
        for (Parent parent : people.get(nameToPrint).getParents()) {
            System.out.printf("%s %s\n", parent.getName(), parent.getBirthday());
        }
        System.out.println("Children:");
        for (Child child : people.get(nameToPrint).getChildren()) {
            System.out.printf("%s %s\n", child.getName() ,child.getBirthday());
        }
    }
}
