package models;

public class Filme {
    private String titulo;
    private Genero genero;

    public Filme(String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }
}
