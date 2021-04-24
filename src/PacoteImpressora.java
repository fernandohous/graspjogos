public class PacoteImpressora implements Impressora {
    private Pacote pacote;

    public PacoteImpressora(Pacote pacote) {
        this.pacote = pacote;
    }

    @Override
    public void imprimir() {
        System.out.println(this.pacote.getTitulo());

        String valor = "Valor: R$ " + this.pacote.preco();
        if (this.pacote.getDesconto() > 0) {
            valor += " (-" + this.pacote.getDesconto() + "%)";
        }
        System.out.println(valor);

        System.out.println("Conteúdo:");
        RelacionadoImpressora relacionado;
        for (Item item: this.pacote.relacionados()) {
            relacionado = new RelacionadoImpressora(item);
            relacionado.imprimir();
        }
    }
}
