package shopping_spree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Created by Simona Simeonova on 25-Feb-17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Person> people = new LinkedHashMap<>();
        LinkedHashMap<String, Product> products = new LinkedHashMap<>();

        String[] peopleLines = scan.readLine().split(";");
        boolean toBreak = true;
        while(toBreak) {
            for (String peopleLine : peopleLines) {
                String[] currLine = peopleLine.split("=");
                try {
                    people.put(currLine[0], new Person(currLine[0], Double.parseDouble(currLine[1])));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    toBreak=false;
                }
            }
            String[] productsLines = scan.readLine().split(";");
            for (String productLine : productsLines) {
                String[] currpLine = productLine.split("=");
                products.put(currpLine[0], new Product(currpLine[0], Double.parseDouble(currpLine[1])));
            }

            while (true) {
                String[] cmd = scan.readLine().split("\\s+");
                if (cmd[0].equals("END")) {
                    break;
                }
                try {
                    people.get(cmd[0]).buy(products.get(cmd[1]));
                    System.out.printf("%s bought %s\n", cmd[0], cmd[1]);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    toBreak=false;
                }
            }

            for (String person : people.keySet()) {
                if (people.get(person).getBag().size() == 0) {
                    System.out.printf("%s - Nothing bought", person);
                } else {
                    System.out.printf("%s - ", person);
                    people.get(person).printBag();
                }
            }
        }
    }
}
