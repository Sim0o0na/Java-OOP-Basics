package vehicles;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.function.DoubleBinaryOperator;

/**
 * Created by Sim0o on 3/6/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] carInfo = reader.readLine().split("\\s+");
        String[] truckInfo = reader.readLine().split("\\s+");
        String[] busInfo = reader.readLine().split("\\s+");
        int n = Integer.parseInt(reader.readLine());

        Car car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));
        Bus bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));
        NumberFormat formatter = new DecimalFormat("0.######");


        while (n-->0) {
            String[] command = reader.readLine().split("\\s+");
            try {
                if (command[0].toLowerCase().equals("drive")) {
                    if (command[1].toLowerCase().equals("car")) {
                        executeDrive(car, command, formatter);
                    } else if (command[1].toLowerCase().equals("truck")) {
                        executeDrive(truck, command, formatter);
                    } else if (command[1].toLowerCase().equals("bus")) {
                        executeDrive(bus, command, formatter);
                    }
                } else if (command[0].toLowerCase().equals("refuel")) {
                    if (command[1].toLowerCase().equals("car")) {
                        executeRefuel(car, command);
                    } else if (command[1].toLowerCase().equals("truck")) {
                        executeRefuel(truck, command);
                    } else if (command[1].toLowerCase().equals("bus")) {
                        executeRefuel(bus, command);
                    }
                }
                if (command[0].toLowerCase().equals("driveempty")) {
                    bus.driveWithoutPeople(Double.parseDouble(command[2]));
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());
    }
    private static void executeRefuel(Vehicle vehicle, String[] command) {
        vehicle.refuel(Double.parseDouble(command[2]));
    }

    private static void executeDrive(Vehicle vehicle, String[] command, NumberFormat format) {
        try{
            vehicle.drive(Double.parseDouble(command[2]));
            System.out.printf("%s travelled %s km\n", command[1], format.format(Double.parseDouble(command[2])));
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
