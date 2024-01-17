package com.corenetworks.springCoreFundamentos.modelo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("tp")
public class TallerPintura implements ITaller {

	@Override
	public String reparar(Coche c) {
		// TODO Auto-generated method stub
		return "El coche con la matricula " + c.getMatricula() + " se est� pintando ";
	}

}
