package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.service.to.EstudianteTO;

public interface IEstudianteService {

	public Estudiante consultarPorCedula(String cedula);

	public void guardar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public void actualizarParcial(String cedulaActual, String cedulaNueva);

	public void borrar(Integer id);

	public Estudiante buscarPorId(Integer id);

	public List<Estudiante> mostrarTodos(String provincia);

	public List<EstudianteTO> buscarTodos();
	
	public Integer guardarConRetorno(Estudiante estudiante);
}
