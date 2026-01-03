package academy.devdojo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 // @RequestMapping(value = "greetings")
public class HelloController {

    // Posso usar o RequestMapping a nível de classe e colocar o /greetings em todos os endpoints da classe

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

//    @RequestMapping(method = RequestMethod.GET, value = "hi")
//    public String hi() {
//        return "OMAE WA MOU SHINDE IRU";
//    }   -- Forma antiga de usar o @GetMapping

//    @GetMapping("greetings/hi")
//    public String hi() {
//        return "OMAE WA MOU SHINDE IRU";
//    } -- Posso fazer assim, se eu quiser
}
