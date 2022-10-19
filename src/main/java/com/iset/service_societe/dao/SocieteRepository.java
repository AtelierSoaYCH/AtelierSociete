package com.iset.service_societe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.iset.service_societe.entity.Societe;

@RepositoryRestResource
public interface SocieteRepository extends JpaRepository<Societe, Long> {
	@RestResource(path = "name")
	List<Societe> findByName(@Param("name") String name);
}
