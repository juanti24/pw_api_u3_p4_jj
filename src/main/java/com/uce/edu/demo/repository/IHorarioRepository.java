package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Horario;

public interface IHorarioRepository {

	public Horario seleccionarPorCodigo(String codigo);

	public void insertar(Horario horario);

	public void actualizar(Horario horario);

	public void actualizarParcial(String nombreActual, String nombreNuevo);

	public void borrar(Integer id);

	public List<Horario> buscarTodos();

	public Horario buscarID(Integer id);

}
