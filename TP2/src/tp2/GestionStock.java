package tp2;

import java.util.Scanner;

public class GestionStock {

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual, cantidadVendida, nuevoStock, cantidadRecibida;
        
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = input.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = input.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = input.nextInt();

        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);

    }
    
}
