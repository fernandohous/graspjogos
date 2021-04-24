import java.util.List;

public class ItemController {

    private ItemRepositorio itemRepositorio;

    public ItemController() {
        this.itemRepositorio = new ItemRepositorio();
    }

    public Jogo criaJogo(String titulo, double preco) {
        Jogo jogo = new Jogo(titulo, preco);
        this.itemRepositorio.adiciona(jogo);
        return jogo;
    }

    public Expansao criaExpansao(String titulo, double preco, Jogo jogo) {
        Expansao expansao = new Expansao(titulo, preco, jogo);
        this.itemRepositorio.adiciona(expansao);
        return expansao;
    }

    public Pacote criaPacote(String titulo, double desconto, List<Item> itens) {
        Pacote pacote = new Pacote(titulo, desconto);
        for (Item item: itens) {
            pacote.adicionarItem(item);
        }
        this.itemRepositorio.adiciona(pacote);
        return pacote;
    }

    public List<Item> listar() {
        return this.itemRepositorio.lista();
    }

    public void mostraLista() {
        for (Item item: this.itemRepositorio.lista()) {
            RelacionadoImpressora impressora = new RelacionadoImpressora(item);
            impressora.imprimir();
        }
    }

    public void mostra(Jogo jogo) {
        JogoImpressora impressora = new JogoImpressora(jogo);
        impressora.imprimir();
    }

    public void mostra(Expansao expansao) {
        ExpansaoImpressora impressora = new ExpansaoImpressora(expansao);
        impressora.imprimir();
    }

    public void mostra(Pacote pacote) {
        PacoteImpressora impressora = new PacoteImpressora(pacote);
        impressora.imprimir();
    }
}
