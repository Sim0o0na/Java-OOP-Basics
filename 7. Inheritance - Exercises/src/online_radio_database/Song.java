package online_radio_database;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class Song {
    private String artist;
    private String name;
    private Integer minutes;
    private Integer seconds;

    public Song(String artist, String name, Integer minutes, Integer seconds) throws InvalidSongException {
        this.setArtist(artist);
        this.setName(name);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) throws InvalidArtistNameException {
        if(artist.length()<3 || artist.length()>20){
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
        }
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidSongNameException {
        if(name.length()<3 || name.length()>30){
            throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
        }
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) throws InvalidSongMinutesException {
        if(minutes<0 || minutes>14){
            throw new InvalidSongMinutesException("Song minutes should be between 0 and 14.");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) throws InvalidSongSecondsException {
        if(seconds<0 || seconds>59){
            throw new InvalidSongSecondsException("Song seconds should be between 0 and 59.");
        }
        this.seconds = seconds;
    }
}
