package br.com.senac.segunda_api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Scanner;
@Controller
@RequestMapping("/calcular")

public class Calcular {
    @GetMapping("/soma")
        public ResponseEntity<Double> soma (
                @RequestParam double numero1,
                @RequestParam double numero2) {
        double soma = numero1 + numero2;

        return ResponseEntity.ok(soma);
    }

    @GetMapping("/subtracao")
    public ResponseEntity<Double> subtracao (
            @RequestParam double numero1,
            @RequestParam double numero2) {
        double subtracao = numero1 - numero2;
        return ResponseEntity.ok(subtracao);
    }

    @GetMapping("/multi")
    public ResponseEntity<Double> multi (
            @RequestParam double numero1, @RequestParam double numero2) {
        double multi = numero1 * numero2;
        return ResponseEntity.ok(multi);
    }

    @GetMapping("/divisao")
    public ResponseEntity<Double> divisao (
            @RequestParam double numero1,
            @RequestParam double numero2) {
        double divisao = numero1/numero2;
        return ResponseEntity.ok(divisao);
    }

}
