package com.roses.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bloques")
public class Bloque implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_bloque")
	private Integer idBloque;
	
	@Column(name="codigo")
	private String codigo;
	
	
	@Column(name="numero_camas")
	private short numeroCamas;

	@JoinColumn(name="id_invernadero", referencedColumnName= "id_invernadero")
	@ManyToOne
	private Invernadero invernadero;
		
	@OneToOne(mappedBy = "bloque")
	private Cultivo cultivo;
		
		
	public Bloque() {
		super();	
	}
	

	public Bloque(Integer idBloque) {
		super();
		this.idBloque = idBloque;
	}


	public Integer getIdBloque() {
		return idBloque;
	}


	public void setIdBloque(Integer idBloque) {
		this.idBloque = idBloque;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public short getNumeroCamas() {
		return numeroCamas;
	}


	public void setNumeroCamas(short numeroCamas) {
		this.numeroCamas = numeroCamas;
	}


	public Invernadero getInvernadero() {
		return invernadero;
	}


	public void setInvernadero(Invernadero invernadero) {
		this.invernadero = invernadero;
	}


	public Cultivo getCultivo() {
		return cultivo;
	}


	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}
	
	
	

}
