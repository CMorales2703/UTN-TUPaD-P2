package tp3;

public class RegistroMascota {

    public static void main(String[] args) {
           Mascota miMascota = new Mascota();
           miMascota.setearNombre("Vader");
           miMascota.setearEspecie("Felino");
           miMascota.setearEdad(3);
           
           miMascota.mostrarInfo();
           
           miMascota.cumplirAnios();
           miMascota.mostrarInfo();
    }
    
}
