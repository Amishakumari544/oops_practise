import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Album album1 = new Album("Moosa","unknown");
        album1.addSongToAlbum(2.05,"chunari");
        album1.addSongToAlbum(1.05,"keshariya");
        album1.addSongToAlbum(2.05,"chunari");



        System.out.println(album1.findSong("chunari"));

        //playlist


        LinkedList<Song> myPlaylist = new LinkedList<>();
        album1.addToPlaylistFromAlbum("chunari",myPlaylist);

    }
}