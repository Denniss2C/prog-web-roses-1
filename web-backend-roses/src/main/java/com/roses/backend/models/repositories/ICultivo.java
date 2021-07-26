package com.roses.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.roses.backend.models.entities.Cultivo;

public interface ICultivo extends CrudRepository<Cultivo, Integer> {
	
}
