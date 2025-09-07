/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7;

/**
 *
 * @author Neoland
 */
public class ej7 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Crear motor (puede existir independientemente del vehículo)
        Motor motor = new Motor("Diesel", "MTR123456");

        // Crear conductor
        Conductor conductor = new Conductor("Juan López", "LIC12345");

        // Crear vehículo y asociarle el motor
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Hilux", motor);

        // Asociar bidireccionalmente vehículo y conductor
        conductor.setVehiculo(vehiculo);

        // Mostrar información desde el vehículo
        System.out.println(">>> Desde el Vehículo:");
        System.out.println(vehiculo);

        // Mostrar información desde el conductor
        System.out.println("\n>>> Desde el Conductor:");
        System.out.println(conductor);

        // Mostrar información del motor
        System.out.println("\n>>> Motor asociado:");
        System.out.println(motor);
    }
    
}
