package src;        

public class LivroFisico extends Livro {
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        double valorLivro = this.getValor();
        if (valorLivro <= 0) {
            return 0.0;
        }
        return valorLivro * 0.05;
    }

    @Override
    void mostrarDetalhes(){
        super.mostrarDetalhes();
        System.out.println("Taxa de impressão: " + getTaxaImpressao());
    }
}