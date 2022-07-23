package com.example.VideoDelTema3JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class VideoDelTema3JpaApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(VideoDelTema3JpaApplication.class, args);

		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("find");
		System.out.println("El número de coches en la base de datos es: " + repository.count());

		Coche toyota = new Coche(null, "Toyota", "Prius", 2010);

		repository.save(toyota);

		System.out.println("El número de coches en la base de datos es: " + repository.count());

		System.out.println(repository.findAll());

	}


}
