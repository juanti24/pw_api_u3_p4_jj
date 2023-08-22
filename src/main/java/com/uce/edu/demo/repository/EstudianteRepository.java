package com.uce.edu.demo.repository;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteRepository implements IEstudianteRepository {
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Estudiante seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.cedula=: datoCedula", Estudiante.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}
	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}
	@Override
	public void actualizarParcial(String cedulaActual, String cedulaNueva) {
		// TODO Auto-generated method stub
		Query myQuery = (Query) this.entityManager
				.createQuery("UPDATE Estudiante e SET e.cedula = :datoCedula WHERE e.cedula = :datoCondicion");
		((javax.persistence.Query) myQuery).setParameter("datoCedula", cedulaNueva);
		((javax.persistence.Query) myQuery).setParameter("datoCondicion", cedulaActual);
		((javax.persistence.Query) myQuery).executeUpdate();
	}
	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPorId(id));
	}
	@Override
	public Estudiante buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}
	@Override
	public List<Estudiante> buscarTodos(String provincia) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.provincia =:datoProvincia", Estudiante.class);
		myQuery.setParameter("datoProvincia", provincia);
		return myQuery.getResultList();
	}
	@Override
	public List<Estudiante> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
		return myQuery.getResultList();
	}
}