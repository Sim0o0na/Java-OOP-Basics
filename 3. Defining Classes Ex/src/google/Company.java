package google;

/**
 * Created by Sim0o on 2/28/2017.
 */
public class Company {
    private String name;

    public Company(String name, String department, double salary){
        this.setName(name);
        this.setDepartment(department);
        this.setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String department;
    private double salary;

    @Override
    public String toString(){
        return String.format("Company:\n%s %s %.2f", this.getName(), this.getDepartment(), this.getSalary());
    }

}
