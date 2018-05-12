package com.coti.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coti.br.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	

}
