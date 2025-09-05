package tp3;

public class RegistroLibro {

    public static void main(String[] args) {
        Libro nuevoLibro = new Libro();
        
        nuevoLibro.setAutor("Antoine de Saint-Exupéry");
        nuevoLibro.setTitulo("El Principito");
        nuevoLibro.setAnioPublicacion(1943);
        
        nuevoLibro.mostrarInfo();
        
        nuevoLibro.setAnioPublicacion(1960);
        nuevoLibro.mostrarInfo();
        
        nuevoLibro.setAnioPublicacion(-200);
        nuevoLibro.mostrarInfo();
    }
    
}
