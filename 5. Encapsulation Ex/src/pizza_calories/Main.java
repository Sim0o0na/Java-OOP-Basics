package pizza_calories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Simona Simeonova on 25-Feb-17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        //String[] cmd = scan.readLine().split("\\s+");
        //String[] cmd2 = scan.readLine().split("\\s+");
        //System.out.printf("%s %s %s\n", flourType, bakingTechnique, weight);
        //Topping topping = new Topping(cmd2[1], Double.parseDouble(cmd2[2]));
        boolean programRunning = true;
        Pizza pizza = null;
        String[] pizzaInitInfo = scan.readLine().split("\\s+");
        String[] doughInfo = scan.readLine().split("\\s+");
        while(programRunning) {
            Dough dough = new Dough(doughInfo[1], doughInfo[2], Double.parseDouble(doughInfo[3]));
            try {
                pizza = new Pizza(pizzaInitInfo[1], dough);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                programRunning=false;
            }
            while (true) {
                String[] toppingInfo = scan.readLine().split("\\s+");
                if (toppingInfo[0].equals("END")) {
                    break;
                }
                try {
                    Topping topping = new Topping(toppingInfo[1], Double.parseDouble(toppingInfo[2]));
                    pizza.addToping(topping);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    programRunning=false;
                }
            }
        }
        if(pizza!=null){
            System.out.println(pizza.getCalories());
        }
    }
}
