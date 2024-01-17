package com.corenetworks.springCoreFundamentos.modelo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class InformeTrimestre1 implements IInforme{

    @Override
    public String getInforme() {
        return "Este es el informe del Trimestre 1";
    }
}
