package mankind;

/**
 * Created by Sim0o on 3/1/2017.
 */
public class Human {
    private String fname;
    private String lname;

    public Human(String fname, String lname){
        this.setFirstName(fname);
        this.setLastName(lname);
    }

    private void setFirstName(String firstName) {
        if(!Character.isUpperCase(firstName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
        if(firstName.length()<4){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.fname = firstName;
    }

    protected void setLastName(String lastName) {
        if(!Character.isUpperCase(lastName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
        else if(lastName.length()<3){
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.lname = lastName;
    }
    public String getLname() {
        return lname;
    }
    public String getFname() {
        return fname;
    }
}
