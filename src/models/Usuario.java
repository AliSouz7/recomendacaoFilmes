package models;

public class Usuario {
    private Genero preferencia;

    public Usuario(Genero preferencia) {
        this.preferencia = preferencia;
    }

    public Genero getPreferencia() {
        return preferencia;
    }
}
