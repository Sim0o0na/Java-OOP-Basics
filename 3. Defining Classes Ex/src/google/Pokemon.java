package google;

/**
 * Created by Sim0o on 2/28/2017.
 */
public class Pokemon {
    private String name;
    private String type;

    public Pokemon(String name, String type){
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
