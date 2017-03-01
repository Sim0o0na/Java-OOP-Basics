package google;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by Sim0o on 2/28/2017.
 */
public class Child {
    private String name;
    private String birthday;

    public Child(String name, String birthday) {
        this.setName(name);
        this.setBirthday(birthday);
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
