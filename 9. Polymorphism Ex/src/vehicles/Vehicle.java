package vehicles;

/**
 * Created by Sim0o on 3/6/2017.
 */
public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    public double getTank() {
        return tank;
    }

    private double tank;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    protected void setTankCapacity(double tankCapacity){
        this.tank = tankCapacity;
    }
    public double getTankCapacity(){
        return this.tank;
    }

    private double distance;

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        if(fuelQuantity<0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public abstract void drive(double distance);
    public abstract void refuel(double fuel);
    @Override
    public abstract String toString();
}
