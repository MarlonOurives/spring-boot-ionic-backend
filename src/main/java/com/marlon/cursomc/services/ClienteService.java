package com.marlon.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlon.cursomc.domain.Cliente;
import com.marlon.cursomc.repositories.ClienteRepository;
import com.marlon.cursomc.services.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class ClienteService {

	//===Realiza Busca na categoria pelo Id===// 
	@Autowired
	private ClienteRepository repo;
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		
	}
}
