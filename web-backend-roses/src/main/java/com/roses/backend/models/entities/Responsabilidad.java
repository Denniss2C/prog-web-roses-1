package com.roses.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="responsabilidades")
public class Responsabilidad implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
    private ResponsabilidadKey id;
	
	@ManyToOne
    @MapsId("idCampo")
    @JoinColumn(name = "id_campo")
    private Campo campo;

    @ManyToOne
    @MapsId("idCultivo")
    @JoinColumn(name = "id_cultivo")
    private Cultivo cultivo;
    
    @Column(name = "fecha_asignacion")
    private Calendar fechaAsignacion; 
    
    @Column(name = "fecha_retiro")
    private Calendar fechaRetiro;
    
    @Column(name = "descripcion")
    private String descripcion;
    
	public Responsabilidad(ResponsabilidadKey id) {
		super();
		this.id = id;
	}

	public Responsabilidad() {
		super();
	}

	public ResponsabilidadKey getId() {
		return id;
	}

	public void setId(ResponsabilidadKey id) {
		this.id = id;
	}

	public Campo getCampo() {
		return campo;
	}

	public void setCampo(Campo campo) {
		this.campo = campo;
	}

	public Cultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}

	public Calendar getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Calendar fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public Calendar getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(Calendar fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

    
    
	
	
	
	

}
