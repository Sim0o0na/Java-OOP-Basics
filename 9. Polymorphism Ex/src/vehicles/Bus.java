package vehicles;

/**
 * Created by Sim0o on 3/6/2017.
 */
public class Bus extends Vehicle {
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity){
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }

    @Override
    public void drive(double distance){
        double neededFuel = distance*(this.getFuelConsumption()+1.4);
        if(this.getFuelQuantity()<neededFuel){
            throw new IllegalArgumentException("Bus needs refueling");
        }
        this.setFuelQuantity(this.getFuelQuantity()-neededFuel);
        this.setDistance(this.getDistance()+distance);
    }

    public void driveWithoutPeople(double distance){
        double neededFuel = distance*this.getFuelConsumption();
        if(this.getFuelQuantity()<neededFuel){
            throw new IllegalArgumentException("Bus needs refueling");
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
        String result = String.format("Bus: %.2f", this.getFuelQuantity());
        return result;
    }
}
