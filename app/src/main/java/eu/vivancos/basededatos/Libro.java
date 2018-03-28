package eu.vivancos.basededatos;

public class Libro {
    private int id;
    private String autor;
    private String titulo;
    private Double precio;

    public Libro(int id,String autor, String titulo, Double precio) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}