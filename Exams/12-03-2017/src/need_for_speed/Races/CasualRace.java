package need_for_speed.Races;

import need_for_speed.Cars.Car;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Sim0o on 3/12/2017.
 */
public class CasualRace extends Race {
    public CasualRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }

    public void calculateOverallPerformance(){
        for(Car car: this.getParticipants().values()){
            //(horsepower / acceleration) + (suspension + durability)
            car.setOverallPerformance((car.getHorsepower()/car.getAcceleration()) +(car.getSuspension()+car.getDurability());
        }
    }
    @Override
    public void defineWinners(){
        this.calculateOverallPerformance();
        for (Car car:this.getParticipants().values()){
            System.out.println(car.toString());
        }
        Stream<Map.Entry<Integer,Car>> sorted =
                this.getParticipants().entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(o));
    }
}
