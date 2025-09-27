package com.hibernate_.hibernate_jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate_.hibernate_jpa.entidades.Persona;
import com.hibernate_.hibernate_jpa.respositorios.Rerpro_persona;

@SpringBootApplication
public class HibernateJpaApplication implements CommandLineRunner {
	
	@Autowired
	private Rerpro_persona respositorio;

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Persona> personas = (List<Persona>) respositorio.findAll();
		personas.stream().forEach(persona->System.out.println(persona));
	
	
	}

}
