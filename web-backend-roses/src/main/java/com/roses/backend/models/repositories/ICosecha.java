package com.roses.backend.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.roses.backend.models.entities.Cosecha;

public interface ICosecha extends JpaRepository<Cosecha, Integer> {

}
