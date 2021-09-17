package com.bolsadeideas.springboot.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocaleController {

	@GetMapping("/locale")
	public String locale(HttpServletRequest request) {
		//referer nos entrega el link de la ultima pagina
		String ultimaUrl= request.getHeader("referer");
		return "redirect:".concat(ultimaUrl);
	}
	
}
