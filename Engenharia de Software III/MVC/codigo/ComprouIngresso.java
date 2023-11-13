import java.util.List;

public class ComprouIngresso implements Ingresso {
    private View v;
    private Estoque e;

    public ComprouIngresso(View view, Estoque estoque) {
        this.v = view;
        this.e = estoque;
    }

    public void setView(View view) {
        this.v = view;
    }

    @Override
    public void comprarIngresso() {
        if (e.verificarDisponibilidade()) {
            v.emitirDadosSistema();
        } else {
            v.registrarIngresso();
        }
    }
}
