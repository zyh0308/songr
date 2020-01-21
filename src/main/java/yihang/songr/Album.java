package yihang.songr;

public class Album {
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

}
