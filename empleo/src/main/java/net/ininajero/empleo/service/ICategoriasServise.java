package net.ininajero.empleo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.ininajero.empleo.model.Categoria;



public interface ICategoriasServise {
   void guardar (Categoria categoria);
   List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);
   void eliminar(Integer idCategoria);
   Page<Categoria>buscarTodas(Pageable page);
}
