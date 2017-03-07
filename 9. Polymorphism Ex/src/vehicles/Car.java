package vehicles;

/**
 * Created by Sim0o on 3/6/2017.
 */
public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity){
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption){
        super.setFuelConsumption(fuelConsumption+0.9);
    }
    @Override
    public void drive(double distance){
        double neededFuel = distance*this.getFuelConsumption();
        if(this.getFuelQuantity()<neededFuel){
            throw new IllegalArgumentException("Car needs refueling");
        }
        this.setFuelQuantity(this.getFuelQuantity()-neededFuel);
        this.setDistance(this.getDistance()+distance);
    }
    @Override
    public void refuel(double fuel){
        if(super.getFuelQuantity()+fuel>this.getTank()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.setFuelQuantity(super.getFuelQuantity()+fuel);
    }

    @Override
    public String toString(){
        String result = String.format("Car: %.2f", this.getFuelQuantity());
       return result;
    }
}
