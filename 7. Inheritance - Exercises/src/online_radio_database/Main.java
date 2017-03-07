package online_radio_database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(reader.readLine());

        OnlineRadioDatabase ordb = new OnlineRadioDatabase();
        while (n-->0){
            String[] line = reader.readLine().split(";");
            String songArtist = line[0]; String songName = line[1];
            Integer songMin = Integer.parseInt(line[2].split(":")[0]);
            Integer songSec = Integer.parseInt(line[2].split(":")[1]);
            try{
                Song song = new Song(songArtist, songName, songMin, songSec);
                ordb.addSong(song);
                System.out.println("Song added.");
            } catch (InvalidSongException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(ordb.toString());
    }
}
