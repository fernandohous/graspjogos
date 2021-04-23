public class JogoImpressora implements Impressora {
    private Jogo jogo;

    public JogoImpressora(Jogo jogo) {
        this.jogo = jogo;
    }


    @Override
    public void imprimir() {
        System.out.println("\nTitulo:"
                        +jogo.getTitulo()
                        +"\nValor: R$:"
                        +jogo.preco()
                        +"\nRelacionados: "
                        +jogo.relacionados()
        ); //Aqui ta vindo o array tem que vir os titulos eu acho
    }


}
