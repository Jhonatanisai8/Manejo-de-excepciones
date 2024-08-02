package com.jhonatan.pooexcepciones.PropiasExecepciones;

public class Calculadora {
    public double dividir(int numerador, int dividendo) throws DivisionPorZeroException {
        if (dividendo == 0) {
            // lanzamos la exception
            throw new DivisionPorZeroException("No se puede dividir por cero");
        }
        return numerador / (double) dividendo;
    }
}
