package com.corenetworks.springCoreFundamentos.modelo;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("tm")

@Data
public class TallerMecanica implements ITaller {

	@Override
	public String reparar(Coche c) {
		// TODO Auto-generated method stub
		return "El coche con la matricula " + c.getMatricula() + " se esta reparando en el sistema mec�nico";
	}

}
