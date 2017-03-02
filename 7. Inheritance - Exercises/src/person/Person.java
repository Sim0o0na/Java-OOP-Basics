package person;

/**
 * Created by Sim0o on 3/1/2017.
 */
public class Person {
    protected String name;
    protected int age;

    public Person(String name, Integer age){
        this.setName(name);
        this.setAge(age);
    }


    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        if(name.length() <3){
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if(age<1){
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge()));

        return stringBuilder.toString();
    }

}
