package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.OrdenCobro;

public interface IOrdenCobroRepository {

	public void insertar(OrdenCobro ordenCobro);

	public void actualizar(OrdenCobro ordenCobro);

	public void actualizarParcial(String numeroActual, String numeroNuevo);

	public OrdenCobro consultarPorId(Integer id);

	public OrdenCobro consultarPorNumero(String numero);

	public List<OrdenCobro> consultarTodos();

	public void eliminar(Integer id);

}
