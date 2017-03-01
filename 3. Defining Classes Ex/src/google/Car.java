package google;

/**
 * Created by Sim0o on 2/28/2017.
 */
public class Car {
    private String carModel;
    private double speed;

    public Car(String model, double speed){
        this.setCarModel(model);
        this.setSpeed(speed);
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString(){
        return String.format("Car:\n%s %.0f", this.getCarModel(), this.getSpeed());
    }
}
