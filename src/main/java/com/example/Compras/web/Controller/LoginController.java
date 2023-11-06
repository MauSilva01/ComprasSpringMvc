package com.example.Compras.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

	@RequestMapping("/login")
	public String form(){
		return "Login/formLogin";
	}
	

	
	@GetMapping("/autenticar")
	public String autenticar(@RequestParam("email") String email, @RequestParam("senha") String senha) {
	    // Verificações de autenticação
	    
	    if (email.equals("mauriciokawc@gmail.com") && senha.equals("123456")) {
	        return "redirect:/home/inicio"; // redireciona para a página inicial
	    } else {
	        return "redirect:/login"; // redireciona para a página de login (caso a autenticação falhe)
	    }
	}
}
