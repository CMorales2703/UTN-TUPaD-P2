package tp3;

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return anioPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
         this.autor = autor;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año de publicación inválido. No se modificó.");
            System.out.println();
        }
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println();
            
    }
}
