package need_for_speed.Cars;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sim0o on 3/12/2017.
 */
public class PerformanceCar extends Car {
    private List<String> addOns;
    public PerformanceCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.setAddOns();
    }

    @Override
    protected void setHorsepower(int horsepower){
        horsepower = horsepower + (horsepower*50)/100;
        super.setHorsepower(horsepower);
    }

    @Override
    protected void setSuspension(int suspension){
        suspension = suspension - (suspension*25)/100;
        super.setSuspension(suspension);
    }

    public List<String> getAddOns(){
        return this.addOns;
    }
    private void setAddOns(){
        this.addOns = new ArrayList<>();
    }

    public void addAddOn(String addOn){
        this.getAddOns().add(addOn);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s %s\n", this.getBrand(), this.getModel(), this.getYearOfProduction()));
        sb.append(String.format("%s HP, 100 m/h in %s s\n", this.getHorsepower(), this.getAcceleration()));
        sb.append(String.format("%s Suspension force, %s Durability\n", this.getSuspension(), this.getDurability()));
        if(this.getAddOns().size() == 0){
            sb.append("Add-ons: None");
        }else{
            sb.append(String.format("Add-ons: %s", String.join(", ", this.getAddOns())));
        }
        return sb.toString();
    }
}
