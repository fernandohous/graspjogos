import java.util.ArrayList;
import java.util.List;

public class Expansao implements Item {

    private double preco;
    private String titulo;
    private Jogo jogo;

    public Expansao(String titulo, double preco, Jogo jogo) {
        this.preco = preco;
        this.titulo = titulo;
        this.jogo = jogo;

        jogo.adicionaRelacionado(this);
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
    public List<Item> relacionados() {
        List<Item> relacionados = new ArrayList<>();
        relacionados.add(this.jogo);

        for (Item item: this.jogo.relacionados()) {
            if (item.getTitulo() != this.titulo) {
                relacionados.add(item);
            }
        }

        return relacionados;
    }
}
