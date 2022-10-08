package net.ininajero.empleo.controller;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.ininajero.empleo.model.Categoria;
import net.ininajero.empleo.service.ICategoriasServise;


@Controller
@RequestMapping(value="/categorias")
public class CategoriasController {
	
	@Autowired
	//@Qualifier("categoriasServiceJpa")
	private ICategoriasServise serviceCategoria;

	// @GetMapping("/index")
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String mostrarIndex(Model model) { 
		List<Categoria> lista = serviceCategoria.buscarTodas();
		model.addAttribute("categorias", lista);
	    return "categorias/listCategorias";
	}
	// @GetMapping("/create")
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String crear(Categoria categoria) {
	return "categorias/formCategoria";
	}
	// @PostMapping("/save")
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String guardar(Categoria categoria, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			for(ObjectError error: result.getAllErrors()) {
				System.out.println("Ocurrio un error: " + error.getDefaultMessage());
			}
				
			return "categorias/formCategorias";
			}
			serviceCategoria.guardar(categoria);
			attributes.addFlashAttribute("msg", "Los datos de la categoria fueron guardados!");
		//	model.addAttribute("msg", "Registro Guardado");
			System.out.println("Categoria: " + categoria);
			return "redirect:/categorias/index";
		}
	   
}
