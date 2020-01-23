package yihang.songr;

import org.graalvm.compiler.nodes.java.NewArrayNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;


    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @GetMapping("/capitalize/{wordToCapitalize}")
    public String getCapitalize(@PathVariable String wordToCapitalize, Model m) {
        wordToCapitalize = wordToCapitalize.toUpperCase();
        m.addAttribute("word", wordToCapitalize);
        return "capitalize";


    }


    @GetMapping("/albums")
    public String getAlbum(Model m) {
//        Album[] albums = new Album[]{new Album("Hollywood's Bleeding ", "Post Malon", 6, 2, "https://upload.wikimedia.org/wikipedia/en/5/58/Post_Malone_-_Hollywood%27s_Bleeding.png"),
//                new Album("Common Jasmin Orange", "Jay Chou", 10, 2000, "https://upload.wikimedia.org/wikipedia/en/3/3f/Common_Jasmin_Orange.jpg"),
//                new Album("Still Fantasy", "Jay Chou", 12, 3000, "https://upload.wikimedia.org/wikipedia/en/d/d1/Stillfantasy.jpg")};
        List<Album> albums = albumRepository.findAll();

        m.addAttribute("albumList", albums);
        return "albums";


    }



    @PostMapping("/albums")
    public RedirectView postAlbum( String title, String artist, int songCount, int length, String imgUrl){
        Album newAlbum=new Album(title,artist,songCount,length,imgUrl);
        albumRepository.save(newAlbum);

        return new RedirectView("/albums");
    }

    @PostMapping("/songs")
    public RedirectView postSongs(long id, String songTitle, int length, int trackNumber){
        Album myAlbum =albumRepository.getOne(id);
        Song newSong=new Song(songTitle,length,trackNumber);
        newSong.album=myAlbum;
        songRepository.save(newSong);
        return new RedirectView("/albums");



    }




}


