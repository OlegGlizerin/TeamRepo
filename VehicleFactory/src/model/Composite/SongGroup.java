package model.Composite;
import java.util.*;

public class SongGroup implements ISongComponent {
    private List<Song> songs = new ArrayList<>();
    private String songGroupDesc = "";
    public SongGroup(String desc){
        this.songGroupDesc = desc;
    }
    public void addSongToGroup(Song songToAdd) {
        songs.add(songToAdd);
    }
    public Song getSongByName(String name) {
        Song songToReturn = null;
        for(Song song : songs) {
            if (song.getSongName().equals(name)) {
                songToReturn = song;
            }
        }
        return songToReturn;
    }
    @Override
    public String getSongName() {
        String toReturn = "";
        for(Song song : songs) {
            toReturn += song.getSongName() + " ,";
        }
        return toReturn;
    }

    @Override
    public String getBandName() {
        String toReturn = "";
        for(Song song : songs) {
            toReturn += song.getBandName() + " ,";
        }
        return toReturn;
    }

    @Override
    public void displayInfo() {
        System.out.println("Song group description: " + songGroupDesc);
    }
}
