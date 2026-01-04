package academy.devdojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Spring Bean é uma instância de um objeto criada pelo Spring boot
// Como o RestController entende que isso é um Spring bean?
// Tem 3 anotações que identificam uma classe como um bean
//@Component
//@Service
//@Repository

// Como o Spring identifica esses "beans"?
// Ele identifica através de uma anotação que fica dentro do SpringBootApplication que é o "ComponentScan"
// ComponentScan vai olhar pelas Classes, começando pela raiz do pacote que a classe AnimeServiceApplication está
// no caso é o academy.devdojo e vai procurar por classes que ele identifica como Spring beans
// Nesse caso ele só identifica 1, que é o HelloController, mas o Spring faz o carregamento de outras classes, para funcionar

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
