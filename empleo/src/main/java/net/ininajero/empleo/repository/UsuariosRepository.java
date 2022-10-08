package net.ininajero.empleo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ininajero.empleo.model.Usuario; 



public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
