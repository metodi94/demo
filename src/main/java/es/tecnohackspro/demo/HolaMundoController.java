package es.tecnohackspro.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo(){
        return "Eres un jodido grande hijo de puta";

    }
}