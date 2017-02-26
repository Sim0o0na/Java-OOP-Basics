package raw_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Simona Simeonova on 24-Feb-17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scan.readLine());

        List<Car> cars = new ArrayList<>();
        //String model, double engineSpeed, double enginePower, double cargoWeight, double cargoType,
        //double tire1pressure, int tire1Age,double tire2pressure, int tire2Age,
        //double tire3pressure, int tire3Age,double tire4pressure, int tire4Age)
        while(n-->0){
            String[] line = scan.readLine().split("\\s+");

            String model = line[0];
            double engineSpeed = Double.parseDouble(line[1]);
            double enginePower = Double.parseDouble(line[2]);
            Engine engine = new Engine(engineSpeed,enginePower);

            double cargoWeight = Double.parseDouble(line[3]);
            String cargoType = line[4];
            Cargo cargo = new Cargo(cargoWeight,cargoType);

            double tire1pressure = Double.parseDouble(line[5]);
            int tire1age = Integer.parseInt(line[6]);

            double tire2pressure = Double.parseDouble(line[7]);
            int tire2age = Integer.parseInt(line[8]);

            double tire3pressure = Double.parseDouble(line[9]);
            int tire3age = Integer.parseInt(line[10]);

            double tire4pressure = Double.parseDouble(line[11]);
            int tire4age = Integer.parseInt(line[12]);
            Car car = new Car(model, engine, cargo, tire1pressure, tire1age,
                    tire2pressure, tire2age, tire3pressure, tire3age,tire4pressure, tire4age);

            cars.add(car);
        }
        String cmd = scan.readLine();

        if(cmd.equals("fragile")) {
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals(cmd))
                    .filter(c->c.getTires().stream()
                            .filter(tire-> { return tire.getPressure()<1;}).collect(Collectors.toList()).size()>0)
                    .forEach(System.out::println);
        }else{
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals(cmd))
                    .filter(car -> car.getEngine().getPower()>250)
                    .forEach(System.out::println);
        }

    }
}
