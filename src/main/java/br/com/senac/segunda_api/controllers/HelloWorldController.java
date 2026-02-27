package br.com.senac.segunda_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @GetMapping("/teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Olá Mundo!");
    }

    //não pode  ter dois get com o mesmo nome.

    @GetMapping("/parImpar")
    public ResponseEntity<String> parImpar(
            @RequestParam int numero) {
        if ((numero % 2) == 0) {
            return ResponseEntity.ok("Par");
        }
        return ResponseEntity.ok("Ímpar");
    }
}
