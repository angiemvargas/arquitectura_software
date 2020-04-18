package co.edu.udea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

    @GetMapping(value = "/hello")
    public String buscarPersonaPorTipoYNumeroID() {
        return "Hola desde el mundo Spring Boot";
    }
}
