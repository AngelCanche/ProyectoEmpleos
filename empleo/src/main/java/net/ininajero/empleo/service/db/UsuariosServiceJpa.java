package net.ininajero.empleo.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import net.ininajero.empleo.model.Usuario;
import net.ininajero.empleo.repository.UsuariosRepository;
import net.ininajero.empleo.service.IUsuariosService;

@Service
@Primary
public class UsuariosServiceJpa implements IUsuariosService {

	@Autowired
	private UsuariosRepository usuariosRepo;
	
	@Override
	public void guardar(Usuario usuario) {
		// TODO Auto-generated method stub
		usuariosRepo.save(usuario);
	}


	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		return usuariosRepo.findAll();
	}

	@Override
	public void eliminar(Integer idUsuario) {
		// TODO Auto-generated method stub
		usuariosRepo.deleteById(idUsuario);
		
	}


	@Override
	public Usuario buscarPorUsername(String Username) {
		// TODO Auto-generated method stub
		return usuariosRepo.findByUsername(Username);
	}

}
