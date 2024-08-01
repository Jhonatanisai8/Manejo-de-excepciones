package com.jhonatan.pooexcepciones.PropiasExecepciones;

import javax.swing.JOptionPane;

public class EjemploExepciones {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero: ");
        int divisor = Integer.parseInt(valor);
        double division = calculadora.dividir(10, divisor);
        try {
            // dividor = Integer.parseInt(valor);
            // int division = 10 / dividor;
            System.out.println("Resultado: " + division);
        } catch (NumberFormatException en) {
            System.out.println("Se detecto una excepcion, ingrese un valor numerico: " + en.getMessage());
            main(args);
        } catch (ArithmeticException e) {
            System.out.println(" Capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
            main(args);
        } finally {
            System.out.println("Ejecuta siempre con o sin excepcion");
        }
        System.out.println("Fin Programa");
    }

}
