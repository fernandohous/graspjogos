import java.util.ArrayList;
import java.util.List;

public class Jogo implements Item {
    private double preco;
    private String titulo;
    private List<Item> relacionados;

    public Jogo(String titulo, double preco) {
        this.preco = preco;
        this.titulo = titulo;
        this.relacionados = new ArrayList<>();
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
        return this.relacionados;
    }

    public void adicionaRelacionado(Item item){
        this.relacionados.add(item);
    }

}
