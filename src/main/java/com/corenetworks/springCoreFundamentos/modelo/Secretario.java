package com.corenetworks.springCoreFundamentos.modelo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Secretario implements IEmpleado{
    @Autowired
    private IInforme i;
    private String email;
    private String empresa;


    @Override
    public String getInforme() {
        return i.getInforme();
    }

    @Override
    public String getTarea() {
        return "Lleva el registro de las reuniones";
    }
}
