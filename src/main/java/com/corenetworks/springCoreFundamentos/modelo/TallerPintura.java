package com.corenetworks.springCoreFundamentos.modelo;

import org.springframework.stereotype.Component;


public class TallerPintura implements ITaller {

	@Override
	public String reparar(Coche c) {
		// TODO Auto-generated method stub
		return "El coche con la matricula " + c.getMatricula() + " se est� pintando ";
	}

}
