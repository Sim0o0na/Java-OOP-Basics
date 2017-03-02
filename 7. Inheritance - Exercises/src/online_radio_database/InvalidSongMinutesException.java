package online_radio_database;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class InvalidSongMinutesException extends InvalidSongLengthException{
    public InvalidSongMinutesException(String s){
        super(s);
    }
}
