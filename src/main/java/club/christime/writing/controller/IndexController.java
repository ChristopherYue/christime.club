package club.christime.writing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/hello")
    public String test(){
        return "hello spring boot ! ";
    }
}
