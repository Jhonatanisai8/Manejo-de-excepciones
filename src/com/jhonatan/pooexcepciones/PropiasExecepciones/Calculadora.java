package com.jhonatan.pooexcepciones.PropiasExecepciones;

public class Calculadora {
    public double dividir(int numerador, int dividendo) throws DivisionPorZeroException {
        if (dividendo == 0) {
            // lanzamos la exception
            throw new DivisionPorZeroException("No se puede dividir por cero");
        }
        return numerador / (double) dividendo;
    }

    public double dividir(String numerdador, String divisor) throws DivisionPorZeroException, FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerdador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        } catch (NumberFormatException e) {

            // llanzamos la excepcion
            throw new FormatoNumeroException("Debe ingresar un número en el numerador y divisor");
        }
    }
}
