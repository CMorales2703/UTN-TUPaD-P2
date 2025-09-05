package tp2;

import java.util.Scanner;

public class CalculadoraDecuentaCategoria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double descuento = 0, precio;
        char categoria;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        categoria = input.nextLine().charAt(0);

        switch (categoria) {
            case 'A','a' -> descuento = 0.10;
            case 'B','b' -> descuento = 0.15;
            case 'C','c' -> descuento = 0.20;
            default -> {
                System.out.println("Categoría no válida.");
                input.close();
                return;
            }
        }

        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);


    }
    
}
