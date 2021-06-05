package com.ejericicio04.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mascota")
public class Mascota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMasctota")
	private int idMasctota;
	
	@Column(name = "nombreMascota")
	private String nombreMascota;
	
	@Column(name = "edadMascota")
	private int edadMascota;
	
	@Column(name = "colorMascota")
	private String colorMascota;
	
	@Column(name = "precioMascota")
	private double precioMascota;

	public int getIdMasctota() {
		return idMasctota;
	}

	public void setIdMasctota(int idMasctota) {
		this.idMasctota = idMasctota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public int getEdadMascota() {
		return edadMascota;
	}

	public void setEdadMascota(int edadMascota) {
		this.edadMascota = edadMascota;
	}

	public String getColorMascota() {
		return colorMascota;
	}

	public void setColorMascota(String colorMascota) {
		this.colorMascota = colorMascota;
	}

	public double getPrecioMascota() {
		return precioMascota;
	}

	public void setPrecioMascota(double precioMascota) {
		this.precioMascota = precioMascota;
	}
	
	
}
