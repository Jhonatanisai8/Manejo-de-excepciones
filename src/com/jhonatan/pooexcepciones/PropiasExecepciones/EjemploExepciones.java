package com.jhonatan.pooexcepciones.PropiasExecepciones;

import javax.swing.JOptionPane;

public class EjemploExepciones {
    public static void main(String[] args) {
        System.out.println("=====MANEJO DE EXCEPCIONES=====");
        ejemplo02();
    }

    public static void ejemplo02() {
        /* instancia de calculadora */
        Calculadora calculadora = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");
        try {
            /* llamamos al metodo de dividir */
            double division02 = calculadora.dividir(numerador, denominador);

            System.out.println("Resultado de la division 02: " + division02);
            // primera excepcion
        } catch (NumberFormatException en) {
            System.out.println("Se detecto una excepcion, ingrese un valor numerico: " + en.getMessage());
            // segunda excepcion
        } catch (DivisionPorZeroException e) {
            System.out.println(" Capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
        } catch (FormatoNumeroException ecp) {
            System.out.println("Se detecto una excepcion: ingrese un numero valido: " + ecp.getMessage());
            ecp.printStackTrace(System.out);
        } finally { /* bloque que si hay o no excepcion se ejecuta */
            System.out.println("Ejecuta siempre con o sin excepcion");
        }
        System.out.println("Fin Programa");
    }

    public static void ejemplo01() {
        /* instancia de calculadora */
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
            // segunda excepcion
        } catch (DivisionPorZeroException e) {
            System.out.println(" Capturamos la excepcion en tiempo de ejecucion: " + e.getMessage());
        } finally { /* bloque que si hay o no excepcion se ejecuta */
            System.out.println("Ejecuta siempre con o sin excepcion");
        }
        System.out.println("Fin Programa");
    }

}
