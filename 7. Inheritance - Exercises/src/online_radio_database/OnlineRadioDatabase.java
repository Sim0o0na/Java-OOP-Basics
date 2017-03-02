package online_radio_database;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sim0o on 3/2/2017.
 */
public class OnlineRadioDatabase {
    private List<Song> songs;
    public OnlineRadioDatabase(){
        songs = new ArrayList<>();
    }

    public List<Song> getSongs(){
        return  this.songs;
    }

    public void addSong(Song song){
        this.getSongs().add(song);
    }

    private String calculateLenght(){
        int totalSeconds = 0;
        for (Song song:this.getSongs()){
            totalSeconds+=song.getSeconds();
            totalSeconds+=song.getMinutes()*60;
        }
        String result = String.format("%sh %sm %ss", totalSeconds / 3600, (totalSeconds % 3600) / 60, totalSeconds % 60);
        return result;
    }

    public String toString(){
        return "Songs added: "+this.getSongs().size()+"\n"+"Playlist length: "+this.calculateLenght();
    }
}
