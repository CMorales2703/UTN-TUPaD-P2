package tp2;

import java.util.Scanner;

public class CalificarEdad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();

        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }


    }
    
}
