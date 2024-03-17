package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EmailController {

    @GetMapping("/envio-email")
    public String enviarEmail() {
        return "Email enviado com sucesso.";
    }
}