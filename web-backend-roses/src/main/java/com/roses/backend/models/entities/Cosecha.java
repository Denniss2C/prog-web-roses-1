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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cosechas")
public class Cosecha implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_cosecha")
	private Integer idCosecha;
	
	@Column(name="fecha")
	private Calendar fecha;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy="cosecha", fetch = FetchType.LAZY)	
	private List<Tallo> tallos;
	
	@OneToMany(mappedBy="cosecha", fetch = FetchType.LAZY)
	private List<Material> materialesUsados;	

	public Cosecha() {
		super();
	}

	public Cosecha(Integer idCosecha) {
		super();
		this.idCosecha = idCosecha;
	}

	public Integer getIdCosecha() {
		return idCosecha;
	}

	public void setIdCosecha(Integer idCosecha) {
		this.idCosecha = idCosecha;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Tallo> getTallos() {
		return tallos;
	}

	public void setTallos(List<Tallo> tallos) {
		this.tallos = tallos;
	}

	public List<Material> getMaterialesUsados() {
		return materialesUsados;
	}

	public void setMaterialesUsados(List<Material> materialesUsados) {
		this.materialesUsados = materialesUsados;
	}
	
	
	
	
	
	
	
	

}
