import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Simona Simeonova on 23-Feb-17.
 */
public class Team {
    private String teamName;
    private List<Person> first;
    private List<Person> reserve;


    public Team(String name){
        setName(name);
        this.first = new ArrayList<>();
        this.reserve = new ArrayList<>();
    }
    public void setName(String name){
        this.teamName = name;
    }
    public void addPerson(Person person){
        if(person.getAge()<40){
            first.add(person);
        }else{
            reserve.add(person);
        }
    }

    public List<Person> getFirstTeam(){
        return Collections.unmodifiableList(first);
    }

    public List<Person> getReserveTeam(){
        return Collections.unmodifiableList(reserve);
    }
}
