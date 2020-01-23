package yihang.songr;

import javax.persistence.*;

@Entity

public class Song {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
     Album album;


    String songTitle;
    int length;
    int trackNumber;

    public Song( String songTitle, int length, int trackNumber) {
        this.songTitle = songTitle;
        this.length = length;
        this.trackNumber=trackNumber;
    }

    public String toString(){
        return "I like " + this.songTitle + " and this song is this long: " + this.length + " , the track number for this song is "+ this.trackNumber +" ";
    }


    public Song(){

    }
}

