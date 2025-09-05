package tp2;

import java.util.Scanner;

public class CalculoPrecioFinal {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase, impuesto, descuento, precioFinal;
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = input.nextDouble();

        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

    }
    
}
