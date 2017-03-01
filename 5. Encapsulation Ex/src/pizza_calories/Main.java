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
        String cmd = scan.readLine();
        Pizza pizza = new Pizza();
        while (!cmd.equals("END")){
            String[] data = cmd.split("\\s+");
            if(data[0].equals("Pizza")){
                try{
                    pizza.setName(data[1]);
                    pizza.setnumberOfToppings(Integer.parseInt(data[2]));
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    System.exit(0);
                }
            }else if(data[0].equals("Dough")){
                try{
                    Dough dough = new Dough(data[1], data[2], Double.parseDouble(data[3]));
                    pizza.setDough(dough);
//                    System.out.printf("%.2f\n", dough.calculateCalories());
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    System.exit(0);
                }
            }else if(data[0].equals("Topping")){
                try{
                    Topping topping = new Topping(data[1], Double.parseDouble(data[2]));
                    pizza.addToping(topping);
//                    System.out.printf("%.2f\n", topping.calculateCalories());
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    System.exit(0);
                }
            }
            cmd=scan.readLine();
        }
        if(pizza.getName()!=null){
            System.out.printf("%s - %.2f",pizza.getName(), pizza.getCalories());
        }
    }
}
