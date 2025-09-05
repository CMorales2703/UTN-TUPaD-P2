package tp3;

public class SimulaciónVuelo {

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Apolo 1");
        nave.setLimiteCombustible(100);
        nave.setCombustible(50);
        nave.mostrarEstado();


        nave.avanzar(60);
        nave.despegar();

        nave.recargarCombustible(150);
        nave.recargarCombustible(30);
        

        nave.avanzar(40);

        System.out.println("\nEstado final de la nave:");
        nave.mostrarEstado();
    }
    
}
