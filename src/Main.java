import models.Filme;
import models.Genero;
import models.Usuario;
import services.Recomendador;


public class Main {

    public static void main(String []args) {

        Filme filme1 = new Filme("Vingadores: Ultimato", Genero.ACAO);
        Filme filme2 = new Filme("A hora do rush", Genero.ACAO);
        Filme filme3 = new Filme("Teddy", Genero.COMEDIA);
        Filme filme4 = new Filme("O Abutre", Genero.SUSPENSE);
        Filme filme5 = new Filme("Alien", Genero.FICCAO);

        Usuario usuario = new Usuario(Genero.ACAO);
        Recomendador recomendador = new Recomendador();

        exibirRecomendacao(filme1, usuario, recomendador);
        exibirRecomendacao(filme2, usuario, recomendador);
        exibirRecomendacao(filme3, usuario, recomendador);
        exibirRecomendacao(filme4, usuario, recomendador);
        exibirRecomendacao(filme5, usuario, recomendador);
    }

    private static void exibirRecomendacao(Filme filme, Usuario usuario, Recomendador recomendador){

            boolean recomendar = recomendador.recomendar(filme, usuario);

            String mensagem;
            if (recomendar) {
                mensagem = "Recomendado";
            } else {
                mensagem = "Não recomendado";
            }

            System.out.println("Filme: " + filme.getTitulo() + " → " + mensagem);
    }
}
