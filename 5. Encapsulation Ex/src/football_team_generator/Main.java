package football_team_generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * Created by Sim0o on 2/27/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Team> teams = new HashMap<>();
        String command = scan.readLine();
        while(!command.equals("END")){
            String[] data = command.split(";");
            if(data[0].equals("Team")){
                Team team = new Team(data[1]);
                teams.put(data[1], team);
            }else if(data[0].equals("Add")){
                Add(teams, data);
            }else if(data[0].equals("Remove")){
                Remove(teams, data);
            }else if(data[0].equals("Rating")){
                Rating(teams, data[1]);
            }
            command=scan.readLine();
        }
    }

    private static void Rating(HashMap<String, Team> teams, String datum) {
        String team = datum;
        if(teams.containsKey(team)) {
            if (!teams.get(team).getPlayers().isEmpty() && teams.containsKey(team)) {
                OptionalDouble average = teams.get(team).getPlayers()
                        .stream()
                        .mapToDouble(a -> a.getSkillLevel())
                        .average();
                System.out.printf("%s - %d\n", team, Math.round(average.getAsDouble()));
            } else {
                System.out.printf("%s - 0\n", team);
            }
        }else{
            System.out.printf("Team %s does not exist.\n", team);
        }
    }

    private static void Remove(HashMap<String, Team> teams, String[] data) {
        String team = data[1];
        String name = data[2];
        List<String> names = teams.get(team).getPlayers().stream()
                        .map(Player::getName)
                        .collect(Collectors.toList());
        if(teams.containsKey(team)) {
            if (names.contains(name)) {
                teams.get(team).removePlayer(name);
            } else {
                System.out.printf("Player %s is not in %s team.\n", name, team);
            }
        }else{
            System.out.printf("Team %s does not exist.\n", team);
        }
    }

    private static void Add(HashMap<String, Team> teams, String[] data) {
        String team = data[1];
        String name = data[2];
        if(teams.containsKey(team)){
            try {
                Player player = new Player(name, Double.parseDouble(data[3]),
                        Double.parseDouble(data[4]), Double.parseDouble(data[5]),
                        Double.parseDouble(data[6]), Double.parseDouble(data[7]));
                teams.get(team).addPlayer(player);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.printf("Team %s does not exist.\n", team);
        }
    }
}
