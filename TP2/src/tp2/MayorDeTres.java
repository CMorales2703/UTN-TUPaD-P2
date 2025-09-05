package tp2;

import java.util.Scanner;

public class MayorDeTres {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mayor, num1, num2, num3;
        
        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();

        System.out.print("Ingrese el tercer número: ");
        num3 = input.nextInt();

        mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor es: " + mayor);


    }
    
}
