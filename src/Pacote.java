import java.util.ArrayList;


public class Pacote implements Item {

    private String titulo;
    private double desconto;
    private ArrayList itens;

    public Pacote(String titulo, double desconto) {
        this.titulo = titulo;
        this.desconto = desconto;
        this.itens = new ArrayList<>() ;
    }

    @Override
    public double preco() {
        return 0;
    }

    @Override
    public String getTitulo() {
        return null;
    }

    @Override
    public ArrayList relacionados() {
        return null;
    }

    public void adicionarItem(Item item){
        this.itens.add(item);
    }
}
