package com.jhonatan.pooexcepciones.PropiasExecepciones;

/*excepcion chequeada */
public class DivisionPorZeroException extends Exception {
    public DivisionPorZeroException(String mensaje) {
        super(mensaje);
    }
}
