package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Materia;

public interface IMateriaRepository {

	public Materia buscarPorId(Integer id);

	public Materia buscarPorNombre(String nombre);

	public void insertar(Materia materia);
	
	public void actualizar(Materia materia);
	
	public void actualizadoParcial(String nombreActual, String nombreNuevo);
	
	public void borrar(Integer id);
	
	public List<Materia> buscarTodos();

	

}
