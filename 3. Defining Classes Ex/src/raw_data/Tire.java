package raw_data;

/**
 * Created by Simona Simeonova on 24-Feb-17.
 */
public class Tire {
    private int age;

    public Tire(int age, double pressure){
        this.age = age; this.pressure = pressure;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    private double pressure;

}