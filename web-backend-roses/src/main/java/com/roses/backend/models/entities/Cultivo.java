package com.roses.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cultivos")
public class Cultivo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="id_cultivo")
	private Integer idCultivo;
	
	@Column(name="fecha_inicio")
	private Calendar fechaInicio;
	
	@Column(name="cama_inicio")
	private int camaInicio;
	
	@Column(name="cama_fin")
	private int camaFin;
			
	@JoinColumn(name = "id_variedad", nullable = false)
	@OneToOne(fetch = FetchType.LAZY)        
	private Variedad variedad;
				
	@JoinColumn(name = "id_bloque", nullable = false)
	@OneToOne(fetch = FetchType.LAZY)
	private Bloque bloque;
	
	
	@OneToOne(mappedBy = "cultivo")
	private Tallo tallo;
	

	@OneToMany(mappedBy="cultivo", fetch = FetchType.LAZY)
	private List<Tratamiento> tratamientos;
		
	
	public Cultivo() {
		super();	
	}
	
	public Cultivo(Integer idCultivo) {
		super();
		this.idCultivo = idCultivo;
	}

	public Integer getIdCultivo() {
		return idCultivo;
	}

	public void setIdCultivo(Integer idCultivo) {
		this.idCultivo = idCultivo;
	}

	public Calendar getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Calendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getCamaInicio() {
		return camaInicio;
	}

	public void setCamaInicio(int camaInicio) {
		this.camaInicio = camaInicio;
	}

	public int getCamaFin() {
		return camaFin;
	}

	public void setCamaFin(int camaFin) {
		this.camaFin = camaFin;
	}

	public Variedad getVariedad() {
		return variedad;
	}

	public void setVariedad(Variedad variedad) {
		this.variedad = variedad;
	}
	
	public Bloque getBloque() {
		return bloque;
	}

	public void setBloque(Bloque bloque) {
		this.bloque = bloque;
	}

	public Tallo getTallo() {
		return tallo;
	}

	public void setTallo(Tallo tallo) {
		this.tallo = tallo;
	}

	public List<Tratamiento> getTratamientos() {
		return tratamientos;
	}

	public void setTratamientos(List<Tratamiento> tratamientos) {
		this.tratamientos = tratamientos;
	}
	
	
	
	
	
	
	
	
	
	
	

}
