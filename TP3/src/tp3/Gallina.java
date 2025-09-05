package tp3;

class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total huevos: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha envejecido. Edad actual: " + edad);
    }

    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("---------------------------");
    }
}
