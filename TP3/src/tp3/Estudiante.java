package tp3;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("");
    } 
    
    public void setearNombre(String nombre){
        this.nombre = nombre;
    }
    public void setearApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setearCurso(String curso){
        this.curso = curso;
    }
    
    public void setearCalificacion(int calificacion){
        this.calificacion = calificacion;
    }
     
    public void subirCalificacion(int puntos){
        calificacion += puntos;
    }

    public void bajarCalificacion(int puntos){
        calificacion -= puntos;
    }

}
