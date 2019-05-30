package com.marlon.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlon.cursomc.domain.Pedido;
import com.marlon.cursomc.repositories.PedidoRepository;
import com.marlon.cursomc.services.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class PedidoService {

	//===Realiza Busca na categoria pelo Id===// 
	@Autowired
	private PedidoRepository repo;
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		
	}
}
