package yihang.songr;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    Album album = new Album("Hollywood's Bleeding ", "Post Malon", 6, 2, "https://upload.wikimedia.org/wikipedia/en/5/58/Post_Malone_-_Hollywood%27s_Bleeding.png");


    @Test
    public void testAlbumTitle(){
        assertEquals( "Hollywood's Bleeding ", album.title);
    }

    @Test
    public void testAlbumArtist(){
        assertEquals("Post Malon",album.artist);
    }

    @Test
    public void testAlbumSongCount(){
        assertEquals(6,album.songCount);
    }

    @Test
    public  void testAlbumLength(){
        assertEquals(2,album.length);
    }
}