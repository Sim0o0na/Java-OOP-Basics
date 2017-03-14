package need_for_speed.Races;

import need_for_speed.Cars.Car;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Sim0o on 3/12/2017.
 */
public class DriftRace extends Race {
    public DriftRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }
    public void calculateSuspensionPerformance(){
        for(Car car: this.getParticipants().values()){
            //(suspension + durability)
            car.suspensionPerformance = (car.getSuspension()/car.getDurability());
        }
    }

    @Override
    public void defineWinners(){
        this.calculateSuspensionPerformance();
        for (Car car:this.getParticipants().values()){
            System.out.println(car.toString());
        }
    }
}
