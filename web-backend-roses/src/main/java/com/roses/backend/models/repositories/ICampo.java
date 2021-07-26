package com.roses.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.roses.backend.models.entities.Campo;

public interface ICampo extends CrudRepository<Campo, Integer> {

}
