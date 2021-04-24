public class JogoImpressora implements Impressora {
    private Jogo jogo;

    public JogoImpressora(Jogo jogo) {
        this.jogo = jogo;
    }

    @Override
    public void imprimir() {
        System.out.println("Jogo: " + this.jogo.getTitulo());
        System.out.println("Valor: R$ " + this.jogo.preco());

        System.out.println("Relacionados:");
        RelacionadoImpressora relacionado;
        for (Item item: this.jogo.relacionados()) {
            relacionado = new RelacionadoImpressora(item);
            relacionado.imprimir();
        }
    }
}
