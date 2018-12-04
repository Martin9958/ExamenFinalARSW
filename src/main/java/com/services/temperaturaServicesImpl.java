package com.services;

import com.model.Convertidor;
import org.springframework.stereotype.Service;

@Service
public class temperaturaServicesImpl implements temperaturaService {

    public Convertidor c;

    @Override
    public Convertidor cambioDeTemperatura(String unidadinicial, double numero, String unidadfinal) {
        double resultado = 0;
        c = new Convertidor(unidadinicial,numero,unidadfinal);
        resultado = c.convertirGrado();
        return c;
    }
}
