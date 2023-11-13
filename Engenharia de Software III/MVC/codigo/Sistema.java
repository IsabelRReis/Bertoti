import java.util.Date;

public class Sistema {
    private String nomeUsuario;
    private Date data;
    private String sessao;

    public Sistema(String nomeUsuario, Date data, String sessao) {
        this.nomeUsuario = nomeUsuario;
        this.data = data;
        this.sessao = sessao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public Date getData() {
        return data;
    }

    public String getSessao() {
        return sessao;
    }

    public boolean matches(Sistema s) {
        return this.nomeUsuario.equals(s.getNomeUsuario()) &&
               this.data.equals(s.getData()) &&
               this.sessao.equals(s.getSessao());
    }
}