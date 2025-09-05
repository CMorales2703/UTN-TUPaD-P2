package tp2;

import java.util.Scanner;

public class DescuentoEspecial {

    static double DECUENTO_GLOBAL = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DECUENTO_GLOBAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;

        System.out.print("Ingrese el precio del producto: ");
        precio = input.nextDouble();

        calcularDescuentoEspecial(precio);

        input.close();
    }
}