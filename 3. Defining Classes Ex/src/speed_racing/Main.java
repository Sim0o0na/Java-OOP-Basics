package speed_racing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Simona Simeonova on 23-Feb-17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scan.readLine());

        LinkedHashMap<String,Car> cars = new LinkedHashMap<>();
        HashSet<String> models = new HashSet<>();
        while(n-- >0){
            String[] info = scan.readLine().split("\\s+");
            String model = info[0]; double fuelAmount = Double.parseDouble(info[1]); double fuelCost = Double.parseDouble(info[2]);
            if(!models.contains(model)){
                cars.put(model,new Car(model,fuelAmount,fuelCost));
            }
            models.add(model);
        }

        while(true){
            String[] cmd = scan.readLine().split("\\s+");
            if(cmd[0].equals("End")){
                for(Car car:cars.values()){
                    System.out.println(car.toString());
                }
                break;
            }
            String model = cmd[1]; double distance = Double.parseDouble(cmd[2]);
            try{
                cars.get(model).drive(distance);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
