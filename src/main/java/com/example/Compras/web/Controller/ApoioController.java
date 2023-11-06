package com.example.Compras.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Apoio")
public class ApoioController {

	@GetMapping("/OpcoesApoio")
	public String OpcaoApoio() {
		
		return "/Apoio";
	}
}
