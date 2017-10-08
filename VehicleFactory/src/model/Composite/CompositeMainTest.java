package model.Composite;

public class CompositeMainTest {
    public CompositeMainTest() {
        startTest();
    }
    private void startTest() {
        SongGroup songGroup = new SongGroup("New group for test");
        songGroup.addSongToGroup(new Song("Dark side of the moon","Pink Floyd"));
        songGroup.addSongToGroup(new Song("Hey Jude","The beatles"));
        songGroup.addSongToGroup(new Song("Highway To Hell","AC/DC"));

        songGroup.displayInfo();
        songGroup.getSongName();
        songGroup.getSongByName("Highway To Hell").displayInfo();
    }
}
