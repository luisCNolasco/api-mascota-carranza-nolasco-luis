package com.ejericicio04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejericicio04.entity.Mascota;
import com.ejericicio04.repository.MascotaRepository;

@Service
public class MascotaServiceImpl implements MascotaService {

	@Autowired
	MascotaRepository repository;
	
	@Override
	public List<Mascota> listarMascotas() {
		return repository.findAll();
	}

}
