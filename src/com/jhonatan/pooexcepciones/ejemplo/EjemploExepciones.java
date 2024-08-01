package com.jhonatan.pooexcepciones.ejemplo;

public class EjemploExepciones {
    public static void main(String[] args) {
        try {
            int division = 10 / 0;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println(" Capturamos la excepcion en tiempo de ejecucion: "+e.getMessage());
        }finally{
            System.out.println("Ejecuta siempre con o sin excepcion");
        }
        System.out.println("Fin Programa");
    }

}
