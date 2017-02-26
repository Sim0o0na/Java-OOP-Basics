package raw_data;

/**
 * Created by Simona Simeonova on 24-Feb-17.
 */
public class Cargo {
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private double weight;
    private String type;

    public Cargo(double w, String t){
        this.weight=w; this.type=t;
    }
}
