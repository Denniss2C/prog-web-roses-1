package com.roses.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.roses.backend.models.entities.Administrativo;

										///El modelo-entidad al que se quiere vincular la gestión
										///El tipo de dato del atributo que representa la PK del modelo-entidad
public interface IAdministrativo extends CrudRepository<Administrativo, Integer> {	
	//También es conocido como el Data Access Object - DAO
	//Sirve para interactuar con la Base de Datos para realizar las gestiones CRUD de los modelos	
}
