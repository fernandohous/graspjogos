public class ExpansaoImpressora implements Impressora {
    private Expansao expansao;

    public ExpansaoImpressora(Expansao expansao) {
        this.expansao = expansao;
    }

    @Override
    public void imprimir() {
        System.out.println("\nTitulo:"
                +expansao.getTitulo()
                +"\nValor: R$:"
                +expansao.preco()
                +"\nRelacionados: "
                +expansao.relacionados()
        ); //Aqui ta vindo o array tem que vir os titulos eu acho
    }
}
