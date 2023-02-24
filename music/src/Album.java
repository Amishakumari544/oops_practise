import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String artist_name;
    private String album_name;

    private List<Song>songs;

    public Album(String artist_name,String album_name)
    {
        this.artist_name =  artist_name;
        this.artist_name = album_name;
//        allocate memory to the list of song which contains a class
        this.songs = new ArrayList<>();

    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    void addSongToAlbum(double duration,String name){
        Song s = new Song(duration,name);
        if(findSong(s.getTitle()) == true)
            System.out.println("already exist!!");
        else {
//            add the song to the album
            songs.add(s);
                System.out.println("new song has been added!");
        }
        return;
    }
//search by title of the song
    public boolean  findSong(String title){
        for(Song s:songs)
        if(s.getTitle().equals(title)){
            return true;
        }
        return  false;
    }

//    ploymorphism = we are using to give the user to add the song by using title or by track number :)

//    playlist is created by user and album belongs to a particular singer
    public void addToPlaylistFromAlbum(String title, LinkedList<Song> playlist){
//        you can only add the song if it's present
//        so, we need to check first if it's present or not in the album.
        if(findSong(title) == true)
        {
//            add to the playlist
            for(Song s : songs)
            {
                if(s.getTitle().equals(title)){
                    playlist.add(s);
                    System.out.println("song added successfully");
                    break;
                }
            }

        }else
            System.out.println("song is not present in the album :(");
        return;

    }

    public void addToPlaylistFromAlbum(int tracknum, LinkedList<Song> playlist){
        int index =  tracknum - 1; // index will be start from 0 because its a arraylist
        if(index >= 0 && index < songs.size()){
            playlist.add(songs.get(index));
        }else
            System.out.println("Invalid track no.");
        return;
    }

}
