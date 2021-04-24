import java.util.ArrayList;
import java.util.List;

public class ItemRepositorio implements Repositorio<Item> {

    private List<Item> itens;

    public ItemRepositorio() {
        this.itens = new ArrayList<>();
    }

    @Override
    public void adiciona(Item registro) {
        this.itens.add(registro);
    }

    @Override
    public List<Item> lista() {
        return this.itens;
    }
}
