package demoapp.controller;

import demoapp.service.PalindromaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PalindromaController {

    @Autowired
    PalindromaService palindromaService;

    @GetMapping("/palindroma")
    public String palindroma(String palabra) {
        return "palindromaForm";
    }

    @PostMapping("/palindroma")
    public String palindroma(@ModelAttribute(name = "palabra") String palabra, Model model) {
        String response = palindromaService.esPalindroma(palabra);
        model.addAttribute("response", response);
        return "response";
    }

}
