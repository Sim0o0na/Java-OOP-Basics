package raw_data;

/**
 * Created by Simona Simeonova on 24-Feb-17.
 */
public class Engine {
    private double speed;
    private double power;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Engine(double speed, double power){
        this.speed = speed; this.power = power;
    }

}
