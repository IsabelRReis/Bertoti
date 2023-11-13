import java.util.List;

public class NãoComprouIngresso implements Ingresso {
    private View v;
    private Estoque e;

    public NãoComprouIngresso(View view, Estoque estoque) {
        this.v = view;
        this.e = estoque;
    }

    public void setView(View view) {
        this.v = view;
    }

    @Override
    public void comprarIngresso() {
        v.registrarIngresso();
    }
}
