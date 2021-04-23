public class PacoteImpressora implements Impressora {
    private Pacote pacote;

    public PacoteImpressora(Pacote pacote) {
        this.pacote = pacote;
    }

    @Override
    public void imprimir() {
        System.out.println("\nTitulo:"
                +pacote.getTitulo()
                +"\nValor: R$:"
                +pacote.preco()
                +"\nRelacionados: "
                +pacote.relacionados()
        ); //Aqui ta vindo o array tem que vir os titulos eu acho
    }
}
