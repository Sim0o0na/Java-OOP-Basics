package pizza_calories;

/**
 * Created by Simona Simeonova on 25-Feb-17.
 */
public class Topping {
    private final static double DEFAULT_CALORIES_PER_GRAM = 2;

    private String type;
    private double weight;
    private double modifier;

    public Topping(String type, double weight){
        this.setType(type);
        this.setWeight(weight);
        this.setModifier(type);
    }

    public double calculateCalories(){
        return this.DEFAULT_CALORIES_PER_GRAM*this.getModifier()*this.getWeight();
    }
    public void setModifier(String type){
        switch (type.toLowerCase()){
            case "meat": this.modifier=1.2; break;
            case "vegggies": this.modifier=0.8; break;
            case "cheese": this.modifier=1.1; break;
            case "sauce": this.modifier=0.9; break;
        }
    }

    public double getModifier(){
        return this.modifier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(!type.toLowerCase().equals("meat")
                && !type.toLowerCase().equals("veggies")
                && !type.toLowerCase().equals("cheese")
                && !type.toLowerCase().equals("sauce")){
            String result = String.format("Cannot place %s on top of your pizza.", type);
            throw new IllegalArgumentException(result);
        }
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<1 || weight>100){
            String result = String.format("%s weight should be in the range [1..50].", type);
            throw new IllegalArgumentException(result);
        }
        this.weight = weight;
    }

}
