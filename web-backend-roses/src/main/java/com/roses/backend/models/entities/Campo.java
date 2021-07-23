package com.roses.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="campos")
public class Campo extends Trabajador implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_campo")
	private Integer idCampo;
	
	@Column(name="especialidad")
	private String especialidad;
	
	@Column(name="tipo")
	private String tipo;
				
	
	public Campo() {
		super();
	}

	public Campo(Integer id) {
		super();
		this.idCampo = id;
	}

	public Integer getIdCampo() {
		return idCampo;
	}

	public void setIdCampo(Integer idCampo) {
		this.idCampo = idCampo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	
	
	
	
	
		

}
