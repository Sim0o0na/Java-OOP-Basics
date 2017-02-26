import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * Created by Simona Simeonova on 23-Feb-17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();
        Team team = new Team("Minor");
        while(n-->0){
            String[] line = reader.readLine().split(" ");
            Person p = new Person(line[0], line[1], Integer.parseInt(line[2]), Double.parseDouble(line[3]));
            team.addPerson(p);
        }
        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}
