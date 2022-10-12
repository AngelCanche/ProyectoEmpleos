package net.ininajero.empleo.service;

import java.util.List;

import net.ininajero.empleo.model.Usuario;

public interface IUsuariosService {

	void guardar(Usuario usuario);
	
	void eliminar(Integer idUsuario);
	
	List<Usuario> buscarTodos();
	
	Usuario buscarPorUsername(String Username);
}
