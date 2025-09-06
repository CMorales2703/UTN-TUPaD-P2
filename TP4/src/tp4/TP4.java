package tp4;

public class TP4 {

     public static void main(String[] args) {
        Empleado e1 = new Empleado(101, "Ana", "Gerente", 5000.0);

        Empleado e2 = new Empleado("Luis", "Analista");
        Empleado e3 = new Empleado("Carla", "Programadora");

        e1.actualizarSalario(10.0);
        e2.actualizarSalario(500);
        e3.actualizarSalario(5.0);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);


        Empleado.mostrarTotalEmpleados();
    }
    
}
