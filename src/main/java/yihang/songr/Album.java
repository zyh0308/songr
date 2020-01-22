package yihang.songr;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

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
        return this.title + " " + this.artist + this.songCount + " "+ this.length+" ";

    }

    //Add a default constructor

    public Album(){

    }

}
