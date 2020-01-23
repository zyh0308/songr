package yihang.songr;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @OneToMany(mappedBy = "album")
    public List<Song> song;

    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String imgUrl;

    public Album(String title, String artist, int songCount, int length, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgUrl = imgUrl;
    }

    public String toString(){
        return this.title + " " + this.artist + this.songCount + " "+ this.length+" "+this.song.toString();

    }

    //Add a default constructor

    public Album(){

    }

}
