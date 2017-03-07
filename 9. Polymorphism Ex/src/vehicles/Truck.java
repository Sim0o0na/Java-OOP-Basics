package vehicles;

/**
 * Created by Sim0o on 3/6/2017.
 */
public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity){
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption){
        super.setFuelConsumption(fuelConsumption+1.6);
    }
    @Override
    public void drive(double distance){
        double neededFuel = distance*this.getFuelConsumption();
        if(this.getFuelQuantity()<neededFuel){
            throw new IllegalArgumentException("Truck needs refueling");
        }
        this.setFuelQuantity(this.getFuelQuantity()-neededFuel);
        this.setDistance(this.getDistance()+distance);
    }
    @Override
    public void refuel(double fuel){
        this.setFuelQuantity(super.getFuelQuantity()+0.95*fuel);
    }

    @Override
    public String toString(){
        String result = String.format("Truck: %.2f", this.getFuelQuantity());
        return result;
    }
}
