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
        public ResponseEntity<Integer> soma (
                @RequestParam int numero1, @RequestParam int numero2) {
        int soma = numero1 + numero2;
        return ResponseEntity.ok(soma);
    }

    @GetMapping("/subtracao")
    public ResponseEntity<Integer> subtracao (
            @RequestParam int numero1, @RequestParam int numero2) {
        int subtracao = numero1 - numero2;
        return ResponseEntity.ok(subtracao);
    }

    @GetMapping("/multi")
    public ResponseEntity<Integer> multi (
            @RequestParam int numero1, @RequestParam int numero2) {
        int multi = numero1 * numero2;
        return ResponseEntity.ok(multi);
    }

    @GetMapping("/divisao")
    public ResponseEntity<Integer> divisao (
            @RequestParam int numero1, @RequestParam int numero2) {
        int divisao = numero1/numero2;
        return ResponseEntity.ok(divisao);
    }

}
