package com.services;

import com.model.Convertidor;

public interface temperaturaService {
    public Convertidor cambioDeTemperatura (String unidadinicial, double numero, String unidadfinal);
}
