/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, sum, res, mul, div;
        
        System.out.print("Ingresa el primer número: ");
        num1 = input.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        num2 = input.nextDouble();
        
        sum = num1 + num2;
        res = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        
        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + res);
        System.out.println("Multiplicación: " + mul);
        System.out.println("División: " + div);
    }
}

