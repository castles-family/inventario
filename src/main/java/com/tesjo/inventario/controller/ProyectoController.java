package com.tesjo.inventario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/proyecto")
public class ProyectoController {
	
	@GetMapping("/inicio")
	
	public String iniciaModulo() {
		return "index";
	}

}
