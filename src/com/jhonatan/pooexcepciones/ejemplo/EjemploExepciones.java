package com.jhonatan.pooexcepciones.ejemplo;

public class EjemploExepciones {
    public static void main(String[] args) {
        try {
            int division = 10 / 0;
            System.out.println(division);
        } catch (Exception e) {
            System.out.println(" Capturamos la excepcion en tiempo de ejecucion: "+e.getMessage());
        }
        System.out.println("Fin Programa");
    }

}
