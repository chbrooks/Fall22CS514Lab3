import java.util.ArrayList;

public class Artist extends Entity {

    ArrayList<Song> songs;
    ArrayList<Album> albums;

    public Artist(String name) {
        super(name);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}
