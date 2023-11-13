public class ComandoWhile extends Comando {
    private String variavel;
    private int condicao;

    public ComandoWhile(String variavel, int condicao) {
        this.variavel = variavel;
        this.condicao = condicao;
        super.setCodigo("- " + variavel + ": int");
    }

    @Override
    public String geraCodigo() {
        return "while " + variavel + " > " + condicao;
    }
}