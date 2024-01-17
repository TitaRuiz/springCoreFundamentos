package com.corenetworks.springCoreFundamentos.modelo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InformeTrimestre2 implements IInforme{
    @Override
    public String getInforme() {
        return "Informe del trimestre 2";
    }
}
