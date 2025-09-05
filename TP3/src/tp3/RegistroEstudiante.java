package tp3;

public class RegistroEstudiante {

    public static void main(String[] args) {
        Estudiante nuevoEstudiante = new Estudiante();
        
        nuevoEstudiante.setearNombre("Cristian");
        nuevoEstudiante.setearApellido("Morales");
        nuevoEstudiante.setearCurso("Ingles");
        nuevoEstudiante.setearCalificacion(7);
        
        nuevoEstudiante.mostrarInfo();
        
        nuevoEstudiante.subirCalificacion(3);
        nuevoEstudiante.mostrarInfo();
        
        nuevoEstudiante.bajarCalificacion(6);
        nuevoEstudiante.mostrarInfo();
    }
    
}
