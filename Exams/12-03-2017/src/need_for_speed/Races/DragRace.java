package need_for_speed.Races;

import need_for_speed.Cars.Car;

import java.util.List;

/**
 * Created by Sim0o on 3/12/2017.
 */
public class DragRace extends Race {
    public DragRace(int length, String route, int prizePool) {
        super(length, route, prizePool);
    }

    public void calculateEnginePerformance(){
        for(Car car: this.getParticipants().values()){
            //(horsepower / acceleration)
            car.enginePerformance = (car.getHorsepower()/car.getAcceleration());
        }
    }

    @Override
    public void defineWinners(){
        this.calculateEnginePerformance();
        for (Car car:this.getParticipants().values()){
            System.out.println(car.toString());
        }
    }
}
