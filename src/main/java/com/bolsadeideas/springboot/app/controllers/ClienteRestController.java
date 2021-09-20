package com.bolsadeideas.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.entity.Cliente;
import com.bolsadeideas.springboot.app.service.IClienteService;
import com.bolsadeideas.springboot.app.view.xml.ClienteList;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;

	@GetMapping(value = "/listar")
	public ClienteList listar() {
		
		return new ClienteList( clienteService.findAll());
		
	}
	
	@GetMapping(value = "/listar-rest")
	public @ResponseBody  List<Cliente> listarRest() {
		
		return clienteService.findAll();
		
	}
	
}
