package net.ininajero.empleo.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import net.ininajero.empleo.model.Categoria;
import net.ininajero.empleo.repository.CategoriasRepository;
import net.ininajero.empleo.service.ICategoriasServise;

@Service
@Primary
public class CategoriasServiceJpa implements ICategoriasServise {

	@Autowired
	private CategoriasRepository categoriasRepo;
	
	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		categoriasRepo.save(categoria);

	}

	@Override
	public List<Categoria> buscarTodas() {
		// TODO Auto-generated method stub
		return categoriasRepo.findAll();
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		// TODO Auto-generated method stub
		Optional<Categoria> optinal = categoriasRepo.findById(idCategoria);
		if(optinal.isPresent()) {
			return optinal.get();
		}
		return null;
	}

}
