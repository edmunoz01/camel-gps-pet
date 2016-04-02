package com.abc.pet.location.pojo;

public class Mensaje {
	
	private float latitud;
	private float longitud;
	private int idCollar;
	private float frecuenciaRespiratoria;
	private float frecuenciaCardiaca;
		
	public Mensaje() {
		super();
	}
	public float getLatitud() {
		return latitud;
	}
	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	public int getIdCollar() {
		return idCollar;
	}
	public void setIdCollar(int idCollar) {
		this.idCollar = idCollar;
	}
	public float getFrecuenciaRespiratoria() {
		return frecuenciaRespiratoria;
	}
	public void setFrecuenciaRespiratoria(float frecuenciaRespiratoria) {
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
	}
	public float getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}
	public void setFrecuenciaCardiaca(float frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}
	
	
}
