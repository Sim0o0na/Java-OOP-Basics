package football_team_generator;

/**
 * Created by Sim0o on 2/27/2017.
 */
public class Player {
    private String name;
    private Team team;
    private double endurance;
    private double sprint;
    private double dribble;
    private double passing;
    private double shooting;
    private double skillLevel;

    public Player(String name, double endurance, double sprint, double dribble, double passing, double shooting){
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
        this.calculateSkillLevel();
    }

    public void calculateSkillLevel(){
        this.skillLevel=(this.getDribble()+this.getEndurance()+this.getPassing()+this.getShooting()+this.getSprint())/5;
    }
    public double getSkillLevel(){
        return this.skillLevel;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null||name.equals("")||name.equals(" ")){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public double getEndurance() {
        return endurance;
    }

    public void setEndurance(double stat) {
        if(stat<0 || stat>100){
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");
        }
        this.endurance = stat;
    }

    public double getSprint() {
        return sprint;
    }

    public void setSprint(double stat) {
        if(stat<0 || stat>100){
            throw new IllegalArgumentException("Sprint should be between 0 and 100.");
        }
        this.sprint = stat;
    }

    public double getDribble() {
        return dribble;
    }

    public void setDribble(double stat) {
        if(stat<0 || stat>100){
            throw new IllegalArgumentException("Dribble should be between 0 and 100.");
        }
        this.dribble = stat;
    }

    public double getPassing() {
        return passing;
    }

    public void setPassing(double stat) {
        if(stat<0 || stat>100){
            throw new IllegalArgumentException("Passing should be between 0 and 100.");
        }
        this.passing = stat;
    }

    public double getShooting() {
        return shooting;
    }

    public void setShooting(double stat) {
        if(stat<0 || stat>100){
            throw new IllegalArgumentException("Shooting should be between 0 and 100.");
        }
        this.shooting = stat;
    }

    @Override
    public String toString(){
        String result = String.format("%s\n Endurance:%s\n Sprint:%s\n Dribble:%s\n Passing:%s\n Shooting:%s\n SkillLevel:%s\n",
                this.name, this.endurance, this.sprint, this.dribble, this.passing, this.shooting, this.skillLevel);
        return result;
    }
}
