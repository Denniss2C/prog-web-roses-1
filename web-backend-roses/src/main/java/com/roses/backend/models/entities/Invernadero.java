package com.roses.backend.models.entities;

import java.io.Serializable;
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
@Table(name="invernaderos")
public class Invernadero implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional=false)
	@Column(name="id_invernadero")
	private Integer idInvernadero;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="altura")
	private float altura;
	
	@Column(name="largo")
	private float largo;
	
	@Column(name="ancho")
	private float ancho;
	
	
	//mappedBy va el nombre del atributo de esta clase [Invernadero] en la clase asociada [Bloque]
	@OneToMany(mappedBy="invernadero", fetch = FetchType.LAZY)	
	private List<Bloque> divisiones;
			
		
	public Invernadero() {
		super();
	}
	
	public Invernadero(int id) {
		super();
		this.idInvernadero = id;
	}

	public Integer getIdInvernadero() {
		return idInvernadero;
	}

	public void setIdInvernadero(Integer idInvernadero) {
		this.idInvernadero = idInvernadero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	
	

}
