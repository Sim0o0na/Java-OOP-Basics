package pizza_calories;

/**
 * Created by Simona Simeonova on 25-Feb-17.
 */
public class Dough {
    private final static double DEFAULT_CALORIES_PER_GRAM = 2;

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight){
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
        this.setModifierByTechnique(bakingTechnique);
        this.setModifierByType(flourType);
    }

    public double calculateCalories(){
        return (this.DEFAULT_CALORIES_PER_GRAM * this.getWeight())
                * this.getModifierByType() * this.getModifierByTechnique();
    }

    //FLOUR TYPE
    public void setFlourType(String flourType) {
        if(!flourType.toLowerCase().equals("white") && !flourType.toLowerCase().equals("wholegrain")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }
    public String getFlourType() {
        return flourType;
    }


    //BAKING TECHNIQUE
    public void setBakingTechnique(String bakingTechnique) {
        if(!bakingTechnique.toLowerCase().equals("chewy")
                && !bakingTechnique.toLowerCase().equals("crispy")
                && !bakingTechnique.toLowerCase().equals("homemade")){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }
    public String getBakingTechnique() {
        return bakingTechnique;
    }

    //WEIGHT
    public void setWeight(double weight) {
        if(weight<1 || weight>100){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


    //MODIFIERS
    public void setModifierByType(String flourType) {
        switch (flourType.toLowerCase()){
            case "white": this.modifierByType = 1.5; break;
            case "wholegrain": this.modifierByType = 1.0; break;
        }
    }

    public double getModifierByType() {
        return modifierByType;
    }

    public void setModifierByTechnique(String bakingTechnique) {
        switch (bakingTechnique.toLowerCase()){
            case "crispy": this.modifierByTechnique = 0.9; break;
            case "chewy": this.modifierByTechnique = 1.1; break;
            case "homemade": this.modifierByTechnique = 1.0; break;
        }
    }

    public double getModifierByTechnique() {
        return modifierByTechnique;
    }



    private double modifierByType;
    private double modifierByTechnique;


}
