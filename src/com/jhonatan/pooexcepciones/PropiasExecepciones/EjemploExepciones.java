package com.jhonatan.pooexcepciones.PropiasExecepciones;

import javax.swing.JOptionPane;

public class EjemploExepciones {
    public static void main(String[] args) {

        /*instancia de calculadora */
        Calculadora calculadora = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un entero: ");
        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(valor);
            division = calculadora.dividir(10, divisor);
            System.out.println("Resultado: " + division);
 
            // primera excepcion
        } catch (NumberFormatException en) {
            System.out.println("Se detecto una excepcion, ingrese un valor numerico: " + en.getMessage());
            main(args);
            // segunda excepcion
        } catch (DivisionPorZeroException e) {
            System.out.println(" Capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
            main(args);
        } finally { /*bloque que si hay o no excepcion se ejecuta */
            System.out.println("Ejecuta siempre con o sin excepcion");
        }
        System.out.println("Fin Programa");
    }

}
