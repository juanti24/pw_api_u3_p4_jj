package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Materia;

public interface IMateriaRepository {
	
	public Materia buscarPorCodigo(String codigo);

	public void insertar(Materia materia);

}
