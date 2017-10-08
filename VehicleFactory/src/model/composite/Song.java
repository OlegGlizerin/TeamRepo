package model.Composite;

public class Song implements ISongComponent{
    private String songName;
    private String bandName;
    public Song(String songName,String bandName){
        this.songName = songName;
        this.bandName = bandName;
    }

    @Override
    public String getSongName() {
        return songName;
    }

    @Override
    public String getBandName() {
        return bandName;
    }

    @Override
    public void displayInfo() {
        System.out.println("Song info: " + songName);
    }
}
