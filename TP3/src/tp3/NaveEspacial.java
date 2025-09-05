package tp3;

class NaveEspacial {
    private String nombre;
    private double combustible;
    private final double costeDespegue = 10;
    private double limiteCombustible;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0 && combustible <= limiteCombustible) {
            this.combustible = combustible;
        } else {
            System.out.println("Cantidad de combustible inválida.");
        }
    }
    
    public void setLimiteCombustible(double limiteCombustible) {
        this.limiteCombustible = limiteCombustible;
    }

    public void despegar() {
        if (combustible >= costeDespegue) {
            combustible -= costeDespegue;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }

    public void avanzar(double distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= limiteCombustible) {
            combustible += cantidad;
            System.out.println(nombre + " recargó " + cantidad + " unidades de combustible. Combustible actual: " + combustible);
        } else {
            System.out.println("No se puede recargar " + cantidad + ". Supera el límite de " + limiteCombustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nombre de la nave: " + nombre);
        System.out.println("Combustible máximo: " + limiteCombustible);
        System.out.println("Combustible actual: " + combustible);
        System.out.println("---------------------------");
    }
}
