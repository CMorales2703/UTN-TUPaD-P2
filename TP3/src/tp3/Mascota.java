package tp3;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("");
    } 
    
    public void setearNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setearEspecie(String especie){
        this.especie = especie;
    }
    
    public void setearEdad(int edad){
        this.edad = edad;
    }
    public void cumplirAnios(){
        this.edad++;
    }

}
