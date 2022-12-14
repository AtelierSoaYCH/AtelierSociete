package com.iset.service_societe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iset.service_societe.dao.SocieteRepository;
import com.iset.service_societe.entity.Societe;

@SpringBootApplication
public class service_societeApplication implements CommandLineRunner {

	@Autowired
	SocieteRepository societeRepository;

	public static void main(String[] args) {
		SpringApplication.run(service_societeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		societeRepository.save(new Societe(null, "a", 100));
		societeRepository.save(new Societe(null, "b", 200));
		societeRepository.save(new Societe(null, "c", 300));

	}

}
