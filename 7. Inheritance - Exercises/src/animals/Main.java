package animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String cmd = reader.readLine();

        while (!cmd.equals("Beast!")) {
            String[] info = reader.readLine().split(" ");
            Animal animal = null;
            String animalName = info[0];
            int animalAge = Integer.parseInt(info[1]);
            String gender;
//            System.out.printf("Name: %s Age: %s Gender: %s\n", animalName, animalAge, gender);
            try {
                switch (cmd.toLowerCase()) {
                    case "cat":
                        gender = info[2];
                        animal = new Cat(info[0], Integer.parseInt(info[1]), gender);
                        break;
                    case "dog":
                        gender = info[2];
                        animal = new Dog(info[0], Integer.parseInt(info[1]), gender);
                        break;
                    case "frog":
                        gender = info[2];
                        animal = new Frog(info[0], Integer.parseInt(info[1]), gender);
                        break;
                    case "kitten":
                        animal = new Kitten(info[0], Integer.parseInt(info[1]), "Female");
                        break;
                    case "tomcat":
                        animal = new Tomcat(info[0], Integer.parseInt(info[1]), "Male");
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            if (animal != null) {
                System.out.println(cmd);
                System.out.println(animal.toString());
                System.out.println(animal.produceSound());
            }
            cmd = reader.readLine();
        }
    }
}
