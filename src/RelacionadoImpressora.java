public class RelacionadoImpressora implements Impressora {

    private Item item;

    public RelacionadoImpressora(Item item) {
        this.item = item;
    }

    @Override
    public void imprimir() {
        System.out.println(this.item.getTitulo() + " - R$ " + this.item.preco());
    }
}
