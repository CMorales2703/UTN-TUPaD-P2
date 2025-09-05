package tp2;

import java.util.Scanner;

public class CostoEnvioYTotalCompra {

    public static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;

        if (zona.equalsIgnoreCase("Nacional")) {
            costo = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costo = peso * 10;
        }
        
        return costo;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioProducto, peso, costoEnvio, total;
        String zona;
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = input.nextLine();

        costoEnvio = calcularCostoEnvio(peso, zona);
        total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
    
}
