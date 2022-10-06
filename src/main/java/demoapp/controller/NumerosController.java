package demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class NumerosController {

    @GetMapping("/numeros")
    public String numerosForm(Integer numero,Model model) {
        model.addAttribute("numero",numero);
        return "numeros";
    }

    @PostMapping("/numeros")
    public String checkNumero(@ModelAttribute(name = "numero") Integer numero, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "numeros";
        }
        String response;
        if (numero%2==0) {
            response = "El número " + numero + " es un número par";
        } else {
            response = "El número " + numero + " no es un número par";
        }
        model.addAttribute("response", response);
        return "response";
    }


}
