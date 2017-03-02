package mankind;

/**
 * Created by Sim0o on 3/1/2017.
 */
public class Student extends Human {
    private String fnum;

    public Student(String fname, String lname, String fnum){
        super(fname, lname);
        this.setFnum(fnum);
    }
    public String getFnum() {
        return fnum;
    }

    private void setFnum(String fnum){
        if(fnum.length()<5 || fnum.length()>10){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.fnum = fnum;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(super.getFname())
                .append(System.lineSeparator())
                .append("Last Name: ").append(super.getLname()).append(System.lineSeparator())
                .append("Faculty number: ").append(this.getFnum())
                .append(System.lineSeparator());
        return sb.toString();

    }
}
