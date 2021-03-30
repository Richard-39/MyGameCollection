package com.myGameCollection.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myGameCollection.servicio.IJuego;

@Controller
@RequestMapping("/juegos")
public class JuegoControlador {

	@Autowired
	IJuego juegoServicio;
	
	public static final Logger log = LoggerFactory.getLogger(JuegoControlador.class);
	
	@GetMapping({"/", ""})
	public String listaJuegos(Model model) {
		
		model.addAttribute("vo", juegoServicio.findAll());
		
		return "listaJuegos";
	}
	
	
}
