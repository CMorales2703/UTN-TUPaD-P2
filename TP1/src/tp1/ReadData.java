/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;

import java.util.Scanner;

public class ReadData {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingresa su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingresa su edad: ");
        edad = Integer.parseInt(input.nextLine());        
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

