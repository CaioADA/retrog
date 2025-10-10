package dev.minig.minigames;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //annotation to define a controller
public class HomeController {
    @RequestMapping("/") //annotation to define the route, when the user goes to the root route, this method will be called
    public String index () {
        return "index.html"; //return the name of the view (index.html)
    }
}
