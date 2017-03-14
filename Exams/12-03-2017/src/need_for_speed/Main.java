package need_for_speed;

import need_for_speed.Cars.ShowCar;
import need_for_speed.Races.Race;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sim0o0na on 3/12/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Garage garage = new Garage();
        HashMap<Integer,Race> races = new HashMap<>();
        CarManager carManager = new CarManager(garage, races);
//        carManager.register(1, "Performance", "Porsche", "Carrera" ,2017,
//                550, 4, 300, 100);
//        carManager.register(2, "Performance", "Porsche2", "Carrera2" ,2017,
//                550, 4, 300, 100);
//        carManager.register(4, "Show", "Porsche", "Carrera" ,2017,
//                550, 4, 300, 100);
//        carManager.open(1, "Casual", 20, "NewYork", 100000);
//        carManager.participate(1,1);
//        carManager.participate(2,1);
//        carManager.participate(4,1);
//        System.out.println(races.get(1).getParticipants().size());
//        System.out.println(carManager.start(1));
        String command = reader.readLine();
        while(!command.equals("Cops Are Here")) {
            String[] splitted = command.split("\\s+");
            switch (splitted[0].toLowerCase()) {
                case "register":
                    carManager.register(Integer.parseInt(splitted[1]), splitted[2], splitted[3], splitted[4],
                            Integer.parseInt(splitted[5]), Integer.parseInt(splitted[6]),  Integer.parseInt(splitted[7]),
                            Integer.parseInt(splitted[8]),  Integer.parseInt(splitted[9]));
                    break;
                case "open":
                    carManager.open(Integer.parseInt(splitted[1]), splitted[2], Integer.parseInt(splitted[3]),
                            splitted[4], Integer.parseInt(splitted[5]));
                    break;
                case "participate":
                    carManager.participate(Integer.parseInt(splitted[1]), Integer.parseInt(splitted[2]));
                    break;
                case "check":
                    System.out.println(carManager.check(Integer.parseInt(splitted[1])));
                    break;
                case "start":
                    System.out.println(carManager.start(Integer.parseInt(splitted[1])));
                case "park":
                    carManager.park(Integer.parseInt(splitted[1]));
                    break;
                case "unpark":
                    carManager.unpark(Integer.parseInt(splitted[1]));
                    break;
            }
            command = reader.readLine();
        }
    }
}
