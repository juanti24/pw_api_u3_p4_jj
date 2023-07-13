package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IMateriaRepository;
import com.uce.edu.demo.repository.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepository iMateriaRepository;

	@Override
	public Materia buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.buscarPorCodigo(codigo);
	}

	@Override
	public void guardar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.insertar(materia);
	}
}