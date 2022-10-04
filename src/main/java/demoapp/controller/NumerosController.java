package demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NumerosController {

    @GetMapping("/numeros")
    public String numerosForm(){
        return "numeros";
    }

    @PostMapping("/numeros/{numero}")
    public String numeros(@PathVariable Integer numero, Model model){
return "numeros";
    }
}
