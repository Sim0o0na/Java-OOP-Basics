package online_radio_database;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class InvalidSongSecondsException extends InvalidSongLengthException {
    public InvalidSongSecondsException(String s){
        super(s);
    }
}
