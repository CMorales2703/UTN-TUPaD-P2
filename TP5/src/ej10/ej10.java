/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;

/**
 *
 * @author Neoland
 */
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear titular
        Titular titular = new Titular("Ana Gómez", "23456789");

        // Crear cuenta bancaria con clave de seguridad y fecha de última modificación como String
        CuentaBancaria cuenta = new CuentaBancaria("CBU987654321", 15000.0, "1234", "07/09/2025");

        // Asociar bidireccionalmente titular y cuenta
        titular.setCuenta(cuenta);

        // Mostrar información desde la cuenta bancaria
        System.out.println(">>> Desde la Cuenta Bancaria:");
        System.out.println(cuenta);

        // Mostrar información desde el titular
        System.out.println("\n>>> Desde el Titular:");
        System.out.println(titular);
    }
    
}
