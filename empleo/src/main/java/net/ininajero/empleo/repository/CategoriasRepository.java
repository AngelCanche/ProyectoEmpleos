package net.ininajero.empleo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ininajero.empleo.model.Categoria; 
//import org.springframework.data.repository.CrudRepository;



//public interface CategoriasRepository extends CrudRepository<Categoria, Integer> {
	public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}
