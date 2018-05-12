package com.coti.br;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coti.br.entity.Usuario;
import com.coti.br.repository.UsuarioRepository;

@SpringBootApplication
public class CrudBackApplication implements CommandLineRunner {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		usuarioRepository.save(new Usuario("jack", "canabarro", "jack@gmail.com"));
		usuarioRepository.save(new Usuario("Jhon", "Tonpo", "jhon@gmail.com"));
		
	}
}
