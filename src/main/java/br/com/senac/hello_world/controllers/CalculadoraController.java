package br.com.senac.hello_world.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/calculadora")
public class CalculadoraController {

    @GetMapping("/soma")
    public ResponseEntity<Double> soma(@RequestParam double numero1, @RequestParam double numero2){
        double i = numero1 + numero2;
        return ResponseEntity.ok(i);

    }

    @GetMapping("/subtracao")
    public ResponseEntity<Double> subtracao(@RequestParam double numero1, @RequestParam double numero2){
        double i = numero1 - numero2;
        return ResponseEntity.ok(i);

    }

    @GetMapping("/multiplicacao")
    public ResponseEntity<Double> multiplicacao(@RequestParam double numero1, @RequestParam double numero2){
        double i = numero1 * numero2;
        return ResponseEntity.ok(i);

    }

    @GetMapping("/divisao")
    public ResponseEntity<Double> divisao(@RequestParam double numero1, @RequestParam double numero2){
        double i = numero1 / numero2;
        return ResponseEntity.ok(i);

    }
}
