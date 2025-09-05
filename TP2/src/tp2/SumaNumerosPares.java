package tp2;

import java.util.Scanner;

public class SumaNumerosPares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = input.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                suma += numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = input.nextInt();
        }

        System.out.println("La suma de los números pares es: " + suma);
    }
    
}
