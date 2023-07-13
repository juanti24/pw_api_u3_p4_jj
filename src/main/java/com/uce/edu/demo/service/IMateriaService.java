package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Materia;

public interface IMateriaService {
	
	public Materia buscarPorCodigo(String codigo);

	public void guardar(Materia materia);

}
