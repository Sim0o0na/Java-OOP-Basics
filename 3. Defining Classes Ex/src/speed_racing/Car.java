package speed_racing;

/**
 * Created by Simona Simeonova on 23-Feb-17.
 */
public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private double distanceTravelled;

    public Car(String m, double fa, double fc){
        this.model = m;
        this.fuelAmount = fa;
        this.fuelCost = fc;
        this.distanceTravelled = 0;
    }


    public void drive(double distance) throws Exception {
        double fuelNeeded = distance*fuelCost;
        if(fuelNeeded>this.getFuelAmount()){
            throw new Exception("Insufficient fuel for the drive");
        }else{
            this.fuelAmount-=fuelNeeded;
            this.distanceTravelled+=distance;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    @Override
    public String toString(){
        return String.format("%s %.2f %s", this.getModel(), this.getFuelAmount(), (int)this.getDistanceTravelled());
    }
}
