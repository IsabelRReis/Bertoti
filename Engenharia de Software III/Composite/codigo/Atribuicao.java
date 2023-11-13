public class Atribuicao extends Comando {
    private String variavel;
    private int valor;

    public Atribuicao(String variavel, int valor) {
        this.variavel = variavel;
        this.valor = valor;
        super.setCodigo("- " + variavel + ": int");
    }

    @Override
    public String geraCodigo() {
        return super.geraCodigo() + " = " + valor;
    }
}