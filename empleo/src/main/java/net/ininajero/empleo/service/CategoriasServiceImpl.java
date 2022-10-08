package net.ininajero.empleo.service;

import java.util.LinkedList;  
import java.util.List;

import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import net.ininajero.empleo.model.Categoria;



@Service
public class CategoriasServiceImpl implements ICategoriasServise{

private List<Categoria> lista = null;
	

	public CategoriasServiceImpl() {
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		lista = new LinkedList<Categoria>();
		try {
			// Creamos la categoria 1
			Categoria categoria1 = new Categoria();
			categoria1.setId(1);
			categoria1.setNombre("Contabilidad"); // Titulo de la categoria
			categoria1.setDescripcion("Trabajos relacionados con el area de RH.");
			
						
			// Creamos la oferta de Trabajo 2.
			Categoria categoria2 = new Categoria();
			categoria2.setId(2);
			categoria2.setNombre("Ventas"); // Titulo de la categoria
			categoria2.setDescripcion("Ofertas de trabajo relacionado con ventas.");
			
			
			// Creamos la oferta de Trabajo 3.
			Categoria categoria3 = new Categoria();
			categoria3.setId(3);
			categoria3.setNombre("Comunicaciones"); // Titulo de la categoria
			categoria3.setDescripcion("Trabajos relacionados con Comunicaciones");
			
			
			Categoria categoria4 = new Categoria();
			categoria4.setId(4);
			categoria4.setNombre("Arquitectura"); // Titulo de la categoria
			categoria4.setDescripcion("Trabajos de arquitectura");
			
			
			Categoria categoria5 = new Categoria();
			categoria5.setId(5);
			categoria5.setNombre("Educacion"); // Titulo de la categoria
			categoria5.setDescripcion("Maestros, tutores, etc");
			
			
			Categoria categoria6 = new Categoria();
			categoria6.setId(6);
			categoria6.setNombre("Desarrollo de software"); // Titulo de la categoria
			categoria6.setDescripcion("Trabajos para programadores");
			
			
			/**
			 * Agregamos los 4 objetos de tipo Vacante a la lista ...
			 */
			lista.add(categoria1);			
			lista.add(categoria2);
			lista.add(categoria3);
			lista.add(categoria4);
			lista.add(categoria5);
			lista.add(categoria6);
			

		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}
	
	}
	


	@Override
	public List<Categoria> buscarTodas() {
		// TODO Auto-generated method stub
		return lista;
	}



	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		lista.add(categoria);
		
	}



	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		// TODO Auto-generated method stub
for(Categoria c : lista) {
			
			if(c.getId()==idCategoria) {
				return c;
			}
		}
		return null;
	}
	
	
	
}



