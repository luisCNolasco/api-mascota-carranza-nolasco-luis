package com.ejericicio04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejericicio04.entity.Mascota;
import com.ejericicio04.service.MascotaService;

@RestController
@RequestMapping("/servicio")
public class MascotaController {

	@Autowired
	MascotaService service;
	
	@GetMapping("/mascota")
	public List<Mascota> listarListMascotas(){
		return service.listarMascotas();
	}
}
