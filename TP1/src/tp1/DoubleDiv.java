/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;

import java.util.Scanner;

public class DoubleDiv {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, div;
        
        System.out.print("Ingresa el primer número: ");
        num1 = input.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        num2 = input.nextDouble();
       
        div = num1 / num2;
        
        System.out.println("División: " + div);
    }
}

