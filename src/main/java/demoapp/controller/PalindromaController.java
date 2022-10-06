package demoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PalindromaController {

    @GetMapping("/palindroma")
    public String palindroma(String palabra) {
        return "palindromaForm";
    }

    @PostMapping("/palindroma")
    public String palindroma(@ModelAttribute(name = "palabra") String palabra, Model model) {
        String response;
        String invertida = new StringBuilder(palabra).reverse().toString().toLowerCase();
        if (invertida.equals(palabra)) {
            response = "Es una palabra palíndroma";
            System.out.println("1");
        } else {
            response = "No es una palabra palíndroma";
            System.out.println("2");
        }
        model.addAttribute("response", response);
        return "response";
    }

}
