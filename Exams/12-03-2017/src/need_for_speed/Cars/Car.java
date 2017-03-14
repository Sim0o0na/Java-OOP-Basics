package need_for_speed.Cars;

/**
 * Created by Sim0o0na on 3/12/2017.
 */
public abstract class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsepower;
    private int acceleration;
    private int suspension;
    private int durability;
    private boolean canParticipate;
    private int overallPerformance;
    private int enginePerformance;
    private int suspensionPerformance;

    public Car(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        this.setBrand(brand);
        this.setModel(model);
        this.setYearOfProduction(yearOfProduction);
        this.setHorsepower(horsepower);
        this.setAcceleration(acceleration);
        this.setSuspension(suspension);
        this.setDurability(durability);
    }

    public String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    protected void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getHorsepower() {
        return horsepower;
    }

    protected void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getAcceleration() {
        return acceleration;
    }

    protected void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getSuspension() {
        return suspension;
    }

    protected void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public int getDurability() {
        return durability;
    }

    protected void setDurability(int durability) {
        this.durability = durability;
    }

    public int getOverallPerformance() {
        return overallPerformance;
    }

    public int getEnginePerformance() {
        return enginePerformance;
    }

    public int getSuspensionPerformance() {
        return suspensionPerformance;
    }

    public void setOverallPerformance(int overallPerformance) {
        this.overallPerformance = overallPerformance;
    }

    public void setEnginePerformance(int enginePerformance) {
        this.enginePerformance = enginePerformance;
    }

    public void setSuspensionPerformance(int suspensionPerformance) {
        this.suspensionPerformance = suspensionPerformance;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s %s\n", this.getBrand(), this.getModel(), this.getYearOfProduction()));
        sb.append(String.format("%s HP, 100 m/h in %s s\n", this.getHorsepower(), this.getAcceleration()));
        sb.append(String.format("%s Suspension force, %s Durability\n", this.getSuspension(), this.getDurability()));
        return sb.toString();
    }
}
