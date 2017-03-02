package online_radio_database;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class InvalidArtistNameException extends InvalidSongException {
    public InvalidArtistNameException(String msg){
        super(msg);
    }
}
