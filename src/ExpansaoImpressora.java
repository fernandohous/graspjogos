public class ExpansaoImpressora implements Impressora {
    private Expansao expansao;

    public ExpansaoImpressora(Expansao expansao) {
        this.expansao = expansao;
    }

    @Override
    public void imprimir() {
        System.out.println("Expansão: " + this.expansao.getTitulo());
        System.out.println("Valor: R$ " + this.expansao.preco());

        System.out.println("Relacionados:");
        RelacionadoImpressora relacionado;
        for (Item item: this.expansao.relacionados()) {
            relacionado = new RelacionadoImpressora(item);
            relacionado.imprimir();
        }
    }
}
