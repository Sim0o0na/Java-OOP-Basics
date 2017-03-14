package need_for_speed;

import need_for_speed.Cars.Car;
import need_for_speed.Cars.PerformanceCar;
import need_for_speed.Cars.ShowCar;
import need_for_speed.Races.CasualRace;
import need_for_speed.Races.DragRace;
import need_for_speed.Races.DriftRace;
import need_for_speed.Races.Race;

import java.util.HashMap;

/**
 * Created by Sim0o on 3/12/2017.
 */
public class CarManager {
    private Garage garage;
    private HashMap<Integer, Race> races;

    public CarManager(Garage garage, HashMap<Integer, Race> races){
        this.garage = garage;
        this.races=races;
    }

    public void register(int id, String type, String brand, String model, int yearOfProduction,
                         int horsepower, int acceleration, int suspension, int durability){
        Car car = null;
        if(type.equals("Performance")){
            car = new PerformanceCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        }
        else if(type.equals("Show")){
            car = new ShowCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        }

        if(car!=null){
            garage.getCreatedCars().put(id, car);
        }
    }

    public String check(int id){
        return this.garage.getCreatedCars().get(id).toString();
    }

    public void open(int id, String type, int length, String route, int prizePool){
        Race race = null;
        if(type.equals("Drag")){
            race = new DragRace(length,route,prizePool);
        }
        else if(type.equals("Drift")){
            race = new DriftRace(length, route, prizePool);
        }
        else if(type.equals("Casual")){
            race = new CasualRace(length, route,prizePool);
        }
        if(race!=null) {
            this.races.put(id, race);
        }
    }

    public void participate(int carId, int raceId){
        if(!this.garage.getParkedCars().containsKey(carId)) {
            this.races.get(raceId).getParticipants().put(carId, this.garage.getCreatedCars().get(carId));
        }
    }


    public String start(int id){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s - %s\n", races.get(id).getRoute(), races.get(id).getLength()));
        int counter = 1;
        for (Car car: races.get(id).getParticipants().values()){
            sb.append(String.format("%s. %s",counter,car.toString()));
            counter++;
        }
        races.get(id).isOver = true;
        return sb.toString();
    }
    public void park(int id){
        for(Race race: this.races.values()){
            if(race.getParticipants().containsKey(id) && race.isOver){
                race.getParticipants().remove(id);
                garage.parkCar(id);
                garage.getCreatedCars().get(id).canParticipate = false;
            }
        }
    }
    public void unpark(int id){
        this.garage.getParkedCars().remove(id);
        this.garage.getCreatedCars().get(id).canParticipate = true;
    }
    public void tune(int tuneIndex, String addOn){
        if(garage.getParkedCars().size()!=0){
            for(Car car:garage.getCreatedCars().values()){

            }
        }
    }
}