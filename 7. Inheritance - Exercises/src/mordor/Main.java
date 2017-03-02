package mordor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");

//        for(String food:input){
//            food = food.toLowerCase();
//            System.out.println(food);
//        }
        Gandalf gandalf = new Gandalf();

            for (String meal:input){
                gandalf.eat(meal.toLowerCase());
            }
            gandalf.setMood();


        System.out.println(gandalf.getHappiness());
        System.out.println(gandalf.getMood());

    }
}
