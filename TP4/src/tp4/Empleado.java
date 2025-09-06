package tp4;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int contadorId = 1;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this(contadorId++, nombre, puesto, 200.0);
    }

    public void actualizarSalario(double porcentaje) {
        double aumento = salario * (porcentaje / 100);
        salario += aumento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void actualizarSalario(int cantidadFija) {
        salario += cantidadFija;
    }

    public static void mostrarTotalEmpleados() {
        System.out.println("Total de empleados creados: " + totalEmpleados);
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

}
