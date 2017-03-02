package animals;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if(name.isEmpty() && name.equals(" ")){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if(age<=0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    protected void setGender(String gender) {
        if(gender.isEmpty() && gender.equals(" ")){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    protected String produceSound(){
        return "Not implemented!";
    }

    @Override
    public String toString(){
        String result = String.format("%s %s %s", this.getName(), this.getAge(), this.getGender());
        return result;
    }
}
