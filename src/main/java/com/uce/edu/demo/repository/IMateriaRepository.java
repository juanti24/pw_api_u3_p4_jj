package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Materia;

public interface IMateriaRepository {

	public Materia seleccionarPorNombre(String nombre);

	public void insertar(Materia materia);

	public void actualizar(Materia materia);

	public Materia buscarPorId(Integer id);

	public void eliminar(Integer id);

	public List<Materia> buscarPorCedulaEstudiante(String cedula);

}
