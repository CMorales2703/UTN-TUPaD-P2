package tp3;

public class Granja {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina(1);
        gallina1.setEdad(2);
        gallina1.setHuevosPuestos(0);

        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(2);
        gallina2.setEdad(3);
        gallina2.setHuevosPuestos(0);

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();

        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.envejecer();

        System.out.println("\nEstado final de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
