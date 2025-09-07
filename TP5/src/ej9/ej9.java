/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9;

/**
 *
 * @author Neoland
 */
public class ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear paciente
        Paciente paciente = new Paciente("Juan Pérez", "OSDE");

        // Crear profesional
        Profesional profesional = new Profesional("Dra. Laura Gómez", "Cardiología");

        // Crear cita médica asociando paciente y profesional (unidireccional)
        CitaMedica cita = new CitaMedica("07/09/2025", "15:30", paciente, profesional);

        // Mostrar información de la cita
        System.out.println(">>> Información de la Cita Médica:");
        System.out.println(cita);

        // Mostrar información del paciente
        System.out.println("\n>>> Información del Paciente:");
        System.out.println(paciente);

        // Mostrar información del profesional
        System.out.println("\n>>> Información del Profesional:");
        System.out.println(profesional);
    }
    
}
