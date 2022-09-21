import java.util.ArrayList;

public class Album extends Entity {
    ArrayList<Song> songs;
    Artist artist;

    public Album(String name) {
        super(name);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
