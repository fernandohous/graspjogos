import java.util.List;

public interface Item {

    public double preco();
    public String getTitulo();
    public List<Item> relacionados();
}
