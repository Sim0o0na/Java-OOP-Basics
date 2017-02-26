/**
 * Created by Simona Simeonova on 23-Feb-17.
 */
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private double salary;

    public Person(String fName, String lName, Integer age, double salary){
        setFirstName(fName);
        setLastName(lName);
        setAge(age);
        setSalary(salary);
    }

    public Person(String name){

    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String fname){
        if(fname.length() < 3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = fname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lname){
        if(lname.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lname;

    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age){
        if(age<=0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age=age;
    }

    public double getSalary() {return this.salary;}

    public void setSalary(double salary){
        if(salary<460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public double increaseSalary(Double n){
        if(this.getAge()<30){
            this.salary +=n/200 * this.getSalary();
        }else{
            this.salary +=this.getSalary()*(n/100);
        }
        return this.salary+n;
    }

    @Override
    public String toString() {
        return this.getFirstName() +" " + this.getLastName() + " get " + this.getSalary()+ " leva";
    }
}
