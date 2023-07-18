package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Horario;

public interface IHorarioService {

	public Horario buscarPorCodigo(String codigo);

	public void ingresar(Horario horario);

	public void actualizar(Horario horario);

	public void eliminar(Integer id);

	public List<Horario> buscarTodos();

	public Horario buscarID(Integer id);

}
