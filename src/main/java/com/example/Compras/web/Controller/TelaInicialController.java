package com.example.Compras.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class TelaInicialController {


	@GetMapping("/inicio")
    public String login() {
        return "Login/TelaInicial"; // retorna o nome da view para exibir a página inicial
    }
}
