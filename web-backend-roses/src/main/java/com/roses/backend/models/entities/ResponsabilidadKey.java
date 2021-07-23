package com.roses.backend.models.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ResponsabilidadKey implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="id_cultivo")
	private Integer idCultivo;
	
	@Column(name="id_campo")
	private Integer idCampo;
	
	public ResponsabilidadKey() {
		super();
	}

	public ResponsabilidadKey(Integer idCultivo, Integer idCampo) {
		super();
		this.idCultivo = idCultivo;
		this.idCampo = idCampo;
	}

	public Integer getIdCultivo() {
		return idCultivo;
	}

	public void setIdCultivo(Integer idCultivo) {
		this.idCultivo = idCultivo;
	}

	public Integer getIdCampo() {
		return idCampo;
	}

	public void setIdCampo(Integer idCampo) {
		this.idCampo = idCampo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCampo, idCultivo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponsabilidadKey other = (ResponsabilidadKey) obj;
		return Objects.equals(idCampo, other.idCampo) && Objects.equals(idCultivo, other.idCultivo);
	}
	
	
	

}
