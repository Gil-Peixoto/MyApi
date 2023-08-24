package com.gil.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gil.myapi.entities.Usuario;
import com.gil.myapi.repositories.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Gil Peixoto", "@Peixoto", "peixoto123");
		Usuario u2 = new Usuario(null, "Gabi Farias", "@Farias", "farias123");
		Usuario u3 = new Usuario(null, "Lucas Peixoto", "@Lucas", "Lucas123");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2, u3));
		
	}

}
