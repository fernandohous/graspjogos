import java.util.ArrayList;
import java.util.List;

public class Pacote implements Item {

    private String titulo;
    private double desconto;
    private List<Item> itens;

    public Pacote(String titulo, double desconto) {
        this.titulo = titulo;
        this.desconto = desconto;
        this.itens = new ArrayList<>() ;
    }

    @Override
    public double preco() {
        double preco = 0;

        for (Item item: this.itens) {
            preco += item.preco();
        }
        preco = preco - (preco * this.desconto / 100);

        return preco;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public List<Item> relacionados() {
        return this.itens;
    }

    public void adicionarItem(Item item){
        this.itens.add(item);
    }

    public double getDesconto() {
        return this.desconto;
    }
}
