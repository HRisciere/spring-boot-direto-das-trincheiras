package academy.devdojo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hi")
    public String hi() {
        return "OMAE WA MOU SHINDE IRU";
    }

//    @GetMapping(value = {"hi", "hi/"})
//    public String hi() {
//        return "OMAE WA MOU SHINDE IRU";
//    }  -- No dia a dia é usado um "reverse proxy" para normalizar, então não é bom fazer isso
//    O outro problema é que precisa fazer a proteção dos dois endpoints, tanto com "hi" quanto com "hi/"
//    Mesmo indo para o mesmo lugar o spring identifica eles como sendo DIFERENTES, então eu vou deixar apenas o "hi"
}
