package google;

import java.util.Date;

/**
 * Created by Sim0o on 2/28/2017.
 */
public class Parent {

    private String name;
    private String birthday;

    public Parent(String name, String date){
        this.setBirthday(date);
        this.setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
