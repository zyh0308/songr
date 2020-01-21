package yihang.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
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
        Album[] albums = new Album[]{new Album("Hollywood's Bleeding ", "Post Malon", 6, 2, "https://upload.wikimedia.org/wikipedia/en/5/58/Post_Malone_-_Hollywood%27s_Bleeding.png"),
                new Album("Common Jasmin Orange", "Jay Chou", 10, 2000, "https://upload.wikimedia.org/wikipedia/en/3/3f/Common_Jasmin_Orange.jpg"),
                new Album("Still Fantasy", "Jay Chou", 12, 3000, "https://upload.wikimedia.org/wikipedia/en/d/d1/Stillfantasy.jpg")};
        m.addAttribute("albumList", albums);
        return "albums";


    }
}


