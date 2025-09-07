/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import ej1.*;

/**
 *
 * @author Neoland
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear banco (puede existir sin tarjeta)
        Banco banco = new Banco("Banco Nación", "30-12345678-9");

        // Crear cliente
        Cliente cliente = new Cliente("Laura Martínez", "34567890");

        // Crear tarjeta de crédito y asociarla al banco
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/26", banco);

        // Asociar bidireccionalmente tarjeta y cliente
        cliente.setTarjeta(tarjeta);

        // Mostrar información desde la tarjeta
        System.out.println(">>> Desde la Tarjeta de Crédito:");
        System.out.println(tarjeta);

        // Mostrar información desde el cliente
        System.out.println("\n>>> Desde el Cliente:");
        System.out.println(cliente);

        // Mostrar información del banco
        System.out.println("\n>>> Banco asociado:");
        System.out.println(banco);
    }
    
}
