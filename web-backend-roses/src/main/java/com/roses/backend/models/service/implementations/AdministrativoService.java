package com.roses.backend.models.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roses.backend.models.entities.Administrativo;
import com.roses.backend.models.repositories.IAdministrativo;
import com.roses.backend.models.service.interfaces.IAdministrativoService;

@Service
public class AdministrativoService implements IAdministrativoService {

	//Sirve para implementar los metodos de gestión, inyectando el DAO
	
	@Autowired	
	IAdministrativo repository; //<= DAO Data Access Objet
		
	@Override
	public void save(Administrativo administrativo) {
		repository.save(administrativo);
	}

	@Override
	public Optional<Administrativo> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);				
	}

	@Override
	public List<Administrativo> findAll() {		
		return (List<Administrativo>) repository.findAll();
	}
	
	
	
	
}
