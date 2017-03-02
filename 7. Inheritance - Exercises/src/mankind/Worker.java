package mankind;

/**
 * Created by Sim0o on 3/1/2017.
 */
public class Worker extends Human {
    private double salary;
    private double hpd;

    public Worker(String firstName, String lastName, double salary, double hpd){
        super(firstName, lastName);
        this.setSalary(salary);
        this.setWorkingHours(hpd);
    }
    @Override
    protected void setLastName(String lastName){
        if(lastName.length()<4){
            throw new IllegalArgumentException("Expected lenght more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    private void setWorkingHours(double hours){
        if(hours<1 || hours>12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hpd = hours;
    }
    public double getSalary() {
        return salary;
    }

    private double getHpd() {
        return hpd;
    }

    private void setSalary(double salary) {
        if(salary<10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.salary = salary;
    }

    protected double salaryPerHour(){
        return this.getSalary()/7/this.getHpd();
    }
    @Override
    public String toString() {
        String result = String.format("First Name: %s\nLast Name: %s\nWeek Salary: %.2f\nHours per day: %.2f\nSalary per hour: %.2f\n",
                super.getFname(), super.getLname(), this.getSalary(), this.getHpd(), this.salaryPerHour());
        return result;
    }
}
