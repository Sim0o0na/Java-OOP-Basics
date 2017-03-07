package wild_farm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by Sim0ona on 3/7/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Class, Function<String, Object>> conversions = new HashMap<>();
        conversions.put(Double.class, Double::parseDouble);
        conversions.put(double.class, Double::parseDouble);
        conversions.put(Integer.class, Integer::parseInt);
        conversions.put(String.class, x -> x);

        String command = reader.readLine();
        while (!command.equals("End")) {
            String[] animalInfo = command.split("\\s+");
            String[] foodInfo = reader.readLine().split("\\s+");
            Food food = null;
            Animal animal = null;
            if(foodInfo[0].equals("Vegetable")){
                food = new Vegetable(Integer.parseInt(foodInfo[1]));
            }
            else if(foodInfo[0].equals("Meat")){
                food = new Meat(Integer.parseInt(foodInfo[1]));
            }
            try {
                Class clazz = Class.forName("wild_farm." + animalInfo[0]);
                Constructor[] constructors = clazz.getConstructors();
                Constructor biggestArgsConstructor  =
                        Stream.of(constructors).sorted((c1,c2) -> Integer.compare(c2.getParameterCount(), c1.getParameterCount()))
                                .toArray(Constructor[]::new)[0];
                Object[] argsToPass = new Object[biggestArgsConstructor.getParameterCount()];
                for (int i = 0; i < biggestArgsConstructor.getParameterCount(); i++) {
                    argsToPass[i] = conversions.get(biggestArgsConstructor.getParameters()[i].getType())
                             .apply(animalInfo[i+1]);
                }
                animal = (Animal)biggestArgsConstructor.newInstance(argsToPass);
                animal.makeSound();
                animal.eatFood(food);

//                if (animalInfo[0].equals("Cat")) {
//                    animal = new Cat(animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3], animalInfo[4]);
//                    animal.makeSoun
// d();
//                    animal.eatFood(food);
//                }
//                if (animalInfo[0].equals("Tiger")) {
//                    animal = new Tiger(animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]);
//                    animal.makeSound();
//                    animal.eatFood(food);
//                }
//                if (animalInfo[0].equals("Zebra")) {
//                    animal = new Zebra(animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]);
//                    animal.makeSound();
//                    animal.eatFood(food);
//                }
//                if (animalInfo[0].equals("Mouse")) {
//                    animal = new Mouse(animalInfo[1], Double.parseDouble(animalInfo[2]), animalInfo[3]);
//                    animal.makeSound();
//                    animal.eatFood(food);
//                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            System.out.println(animal.toString());
            command = reader.readLine();
        }
    }
}
