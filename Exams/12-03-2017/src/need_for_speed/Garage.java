package need_for_speed;

import need_for_speed.Cars.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sim0o on 3/12/2017.
 */
public class Garage {
    private HashMap<Integer, Car> parkedCars;
    private HashMap<Integer, Car> createdCars;

    public Garage() {
        this.setParkedCars();
        this.createdCars = new HashMap<>();
    }

    public  HashMap<Integer, Car> getParkedCars(){
        return this.parkedCars;
    }
    public  HashMap<Integer, Car> getCreatedCars(){
        return this.createdCars;
    }
    private void setParkedCars(){
        this.parkedCars = new HashMap<>();
    }
    public void parkCar(int id){
        this.parkedCars.put(id, this.getCreatedCars().get(id));
    }
    public void createCar(int id, Car car){
        this.createdCars.put(id, car);
    }
}
