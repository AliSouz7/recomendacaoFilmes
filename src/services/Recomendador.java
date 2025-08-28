package services;

import models.Filme;
import models.Usuario;

public class Recomendador {

    public boolean recomendar(Filme filme, Usuario usuario) {
        return filme.getGenero() == usuario.getPreferencia();
    }
}
