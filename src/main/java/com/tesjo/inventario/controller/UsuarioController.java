package com.tesjo.inventario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

@GetMapping("/inicio")
	public String IniciaModulo() {
		
		return "index";
	}
}
