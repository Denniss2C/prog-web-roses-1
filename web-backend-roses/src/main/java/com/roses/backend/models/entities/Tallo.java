package com.roses.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tallos")
public class Tallo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_tallo")
	private Integer idTallo;
	
	@Column(name="numero")
	private Integer numero;
	
	@Column(name="longitud")
	private Integer longitud;
	
	@JoinColumn(name="id_cosecha", referencedColumnName="id_cosecha")
	@ManyToOne
	private Cosecha cosecha;
	
	
	@JoinColumn(name = "id_cultivo", nullable = false)
	@OneToOne(fetch = FetchType.LAZY)
	private Cultivo cultivo;
	
			
	public Tallo() {
		super();
	}

	public Tallo(Integer idTallo) {
		super();
		this.idTallo = idTallo;
	}

	public Integer getIdTallo() {
		return idTallo;
	}

	public void setIdTallo(Integer idTallo) {
		this.idTallo = idTallo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getLongitud() {
		return longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

	public Cosecha getCosecha() {
		return cosecha;
	}

	public void setCosecha(Cosecha cosecha) {
		this.cosecha = cosecha;
	}

	public Cultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}
	
	
	
	
	
	
	

}
