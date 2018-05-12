package com.coti.br.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coti.br.entity.Usuario;
import com.coti.br.repository.UsuarioRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public List<Usuario> getUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public Optional<Usuario> getUsuario(@PathVariable Integer id){
		return usuarioRepository.findById(id);
	}
	
	@DeleteMapping("/usuario")
	public boolean deleteUsuario(Usuario u){
		usuarioRepository.delete(u);
		return true;
	}
	
	@PostMapping("/usuario")
	public Usuario createUsuario(@RequestBody Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
	@PutMapping("/usuario")
	public Usuario updateUsuario(@RequestBody Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
	
	
	
	

}
