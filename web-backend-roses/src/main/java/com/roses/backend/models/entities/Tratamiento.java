package com.roses.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tratamiento")
public class Tratamiento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_tratamiento")
	private Integer idTratamiento;
	
	@Column(name="fecha")
	private Calendar fecha;
	
	@Column(name="tipo")
	private String tipo;
	
	@JoinColumn(name="id_cultivo", referencedColumnName="id_cultivo")
	@ManyToOne
	private Cultivo cultivo;
	
	public Tratamiento() {
		super();
	}
	
	public Tratamiento(Integer idTratamiento) {
		super();
		this.idTratamiento = idTratamiento;
	}



	public Integer getIdTratamiento() {
		return idTratamiento;
	}

	public void setIdTratamiento(Integer idTratamiento) {
		this.idTratamiento = idTratamiento;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Cultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}
	
	
	
	
	

}
