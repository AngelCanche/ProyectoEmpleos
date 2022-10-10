package net.ininajero.empleo.service;

import java.util.List;

import net.ininajero.empleo.model.Categoria; 


public interface ICategoriasServise {
   void guardar (Categoria categoria);
   List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);
   void eliminar(Integer idCategoria);
		
}
