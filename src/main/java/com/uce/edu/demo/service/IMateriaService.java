package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Materia;
import com.uce.edu.demo.service.to.MateriaTO;

public interface IMateriaService {

	public Materia seleccionarPorMateria(String asignatura);

	public void registrar(Materia materia);

	public void actualizar(Materia materia);

	public MateriaTO buscarPorId(Integer id);

	public void borrar(Integer id);

	public List<MateriaTO> buscarPorCedulaEstudiante(String cedula);

}