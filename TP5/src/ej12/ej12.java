/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12;

import ej1.*;

/**
 *
 * @author Neoland
 */
public class ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear contribuyente
        Contribuyente contribuyente = new Contribuyente("Carlos Fernández", "20-12345678-9");

        // Crear impuesto asociado al contribuyente
        Impuesto impuesto = new Impuesto(1500.0, contribuyente);

        // Crear calculadora
        Calculadora calculadora = new Calculadora();

        // Usar la calculadora para calcular el impuesto (dependencia de uso)
        calculadora.calcular(impuesto);

        // Mostrar información del impuesto y del contribuyente
        System.out.println("\n>>> Información del Impuesto:");
        System.out.println(impuesto);

        System.out.println("\n>>> Información del Contribuyente:");
        System.out.println(contribuyente);
    }
    
}
