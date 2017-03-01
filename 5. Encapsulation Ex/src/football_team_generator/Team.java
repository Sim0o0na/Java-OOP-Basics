package football_team_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Sim0o on 2/27/2017.
 */
public class Team {
    private String name;
    private List<Player> players;
    private int numberOfPlayers;
    private double rating;

    public Team(String name){
        this.setName(name);
        this.players = new ArrayList<>();
    }
    public List<Player> getPlayers() {
        return players;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void removePlayer(String playerName){
        ListIterator<Player> iter = this.players.listIterator();
        while(iter.hasNext()){
            if(iter.next().getName().equals(playerName)){
                iter.remove();
            }
        }
    }

}
