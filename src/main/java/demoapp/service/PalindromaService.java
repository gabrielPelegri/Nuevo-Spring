package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromaService {

    public String esPalindroma(String palabra) {
        String response;
        String invertida = new StringBuilder(palabra).reverse().toString().toLowerCase();
        if (palabra.length() == 1) {
            response = palabra + " no es una palabra palíndroma";
        } else {
            if (invertida.equals(palabra.toLowerCase())) {
                response = palabra + " es una palabra palíndroma";
            } else {
                response = palabra + " no es una palabra palíndroma";
            }
        }
        return response;
    }
}
