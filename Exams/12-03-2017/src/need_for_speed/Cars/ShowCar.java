package need_for_speed.Cars;

/**
 * Created by Sim0o on 3/12/2017.
 */
public class ShowCar extends Car {
    private int stars;
    public ShowCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
    }

    public int getStars(){
        return this.stars;
    }
    protected void setStars(int stars){
        this.stars=stars;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s %s\n", this.getBrand(), this.getModel(), this.getYearOfProduction()));
        sb.append(String.format("%s HP, 100 m/h in %s s\n", this.getHorsepower(), this.getAcceleration()));
        sb.append(String.format("%s Suspension force, %s Durability\n", this.getSuspension(), this.getDurability()));
        sb.append(String.format("%s *", this.getStars()));
        return sb.toString();
    }
}
