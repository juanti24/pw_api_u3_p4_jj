package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IOrdenCobroRepository;
import com.uce.edu.demo.repository.modelo.OrdenCobro;

@Service
public class OrdenCobroServiceImpl implements IOrdenCobroService {

	@Autowired
	private IOrdenCobroRepository cobroRepository;

	@Override
	public void generar(OrdenCobro ordenCobro) {
		// TODO Auto-generated method stub
		this.cobroRepository.insertar(ordenCobro);
	}

	@Override
	public void actualizar(OrdenCobro ordenCobro) {
		// TODO Auto-generated method stub
		this.cobroRepository.actualizar(ordenCobro);
	}

	@Override
	public void actualizarParcial(String numeroActual, String numeroNuevo) {
		// TODO Auto-generated method stub
		this.cobroRepository.actualizarParcial(numeroActual, numeroNuevo);
	}

	@Override
	public OrdenCobro buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.cobroRepository.consultarPorId(id);
	}

	@Override
	public OrdenCobro buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.cobroRepository.consultarPorNumero(numero);
	}

	@Override
	public List<OrdenCobro> buscarTodos() {
		// TODO Auto-generated method stub
		return this.cobroRepository.consultarTodos();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.cobroRepository.eliminar(id);
	}

}
