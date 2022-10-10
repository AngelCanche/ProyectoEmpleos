package net.ininajero.empleo.service;

import java.util.List;

import org.springframework.data.domain.Example;

import net.ininajero.empleo.model.Vacante; 


public interface IVacantesService {

	List<Vacante> BuscarTodas();
	Vacante buscarPorId (Integer idVacante);
	void guardar(Vacante vacante);
	List<Vacante> buscarDestacadas();
	void eliminar(Integer idVacante);
	List<Vacante> buscarByExample(Example<Vacante> example);
}
