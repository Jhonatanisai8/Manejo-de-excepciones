package com.jhonatan.pooexcepciones.ejemplo;

import javax.swing.JOptionPane;

public class EjemploExepciones {
    public static void main(String[] args) {

        try {
            String valor = JOptionPane.showInputDialog("Ingrese un entero: ");
            int dividor = Integer.parseInt(valor);
            int division = 10 / dividor;
            System.out.println("Resultado: " + division);
        } catch (NumberFormatException en) {
            System.out.println("Se detecto una excepcion, ingrese un valor numerico: " + en.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(" Capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
        } finally {
            System.out.println("Ejecuta siempre con o sin excepcion");
        }
        System.out.println("Fin Programa");
    }

}
