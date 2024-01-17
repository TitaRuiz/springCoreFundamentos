package com.corenetworks.springCoreFundamentos.modelo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Director implements IEmpleado {
    @Autowired
    private IInforme i;
    @Override
    public String getInforme() {
        return i.getInforme();
    }

    @Override
    public String getTarea() {
        return "El director marca el rumbo a la empresa";
    }
}
