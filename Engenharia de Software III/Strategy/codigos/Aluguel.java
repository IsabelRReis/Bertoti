import java.util.Date;

public class Aluguel implements Livro {
    private String nomeLivro;
    private double valorAluguelLivro;
    private Date dataDevolucao;

    public Aluguel(String nomeLivro, double valorAluguelLivro, Date dataDevolucao) {
        this.nomeLivro = nomeLivro;
        this.valorAluguelLivro = valorAluguelLivro;
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public void livro() {
    }
}
