import java.util.ArrayList;

public class Expansao implements Item {

    private double preco;
    private String titulo;
    private Jogo jogo;

    public Expansao(double preco, String titulo, Jogo jogo) {
        this.preco = preco;
        this.titulo = titulo;
        this.jogo = jogo;
    }

    @Override
    public double preco() {
        return this.preco;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public ArrayList relacionados() {
        return this.relacionados();
    }
}
