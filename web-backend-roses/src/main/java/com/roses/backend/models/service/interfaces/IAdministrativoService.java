package com.roses.backend.models.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.roses.backend.models.entities.Administrativo;

public interface IAdministrativoService {
	
	//La interface del servicio, sirve para definir el conjunto de métodos que 
	//se van a implementar para la Gestión del modelo-entidad	
	
	public void save(Administrativo administrativo); //Guardar -> Create / Update
	public Optional<Administrativo> findById(Integer id); //Consultar -> Retrieve
	public void delete(Integer id); //Borrar -> Delete
	public List<Administrativo> findAll(); //Consultar en conjunto -> List

}
