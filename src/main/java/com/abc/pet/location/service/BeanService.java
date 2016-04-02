package com.abc.pet.location.service;

import org.apache.camel.Body;
import org.example.petlocation.ReceiveLocation;

import com.abc.pet.location.pojo.Mensaje;

public class BeanService {
	public Mensaje saveLocation(@Body ReceiveLocation rl){
		Mensaje mensaje = new Mensaje();
		
		mensaje.setLatitud(Float.parseFloat(rl.getLatitud()));
		mensaje.setLongitud(Float.parseFloat(rl.getLongitud()));
		mensaje.setIdCollar(Integer.parseInt(rl.getIdCollar()));
		mensaje.setFrecuenciaRespiratoria(Float.parseFloat(rl.getFrecuenciaRespiratoria()));
		mensaje.setFrecuenciaCardiaca(Float.parseFloat(rl.getFrecuenciaCardiaca()));
		
		return mensaje;
	}
}
