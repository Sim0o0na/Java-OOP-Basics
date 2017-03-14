package need_for_speed.Races;

import need_for_speed.Cars.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Sim0o on 3/12/2017.
 */
public abstract class Race {
    private int length;
    private String route;
    private int prizePool;
    private HashMap<Integer, Car> participants;
    public boolean isOver;

    public Race(int length , String route, int prizePool) {
        this.setLength(length);
        this.setRoute(route);
        this.setPrizePool(prizePool);
        this.participants = new HashMap<>();
    }

    public int getLength() {
        return length;
    }

    protected void setLength(int length) {
        this.length = length;
    }

    public String getRoute() {
        return route;
    }

    protected void setRoute(String route) {
        this.route = route;
    }

    public int getPrizePool() {
        return prizePool;
    }

    protected void setPrizePool(int prizePool) {
        this.prizePool = prizePool;
    }

    public HashMap<Integer, Car> getParticipants() {
        return participants;
    }

    public abstract void defineWinners();
}
