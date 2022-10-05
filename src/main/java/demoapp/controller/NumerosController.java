package demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NumerosController {

    @GetMapping("/numeros")
    public String numerosForm(Integer numero) {
        return "numeros";
    }

    @PostMapping("/numeros")
    public String checkNumero(@ModelAttribute String numero, Model model) {
        String response;
        if (numero == "2") {
            response = "si";
        } else {
            response = "no";
        }
        model.addAttribute("response", response);
        return "numberResponse";
    }


}
