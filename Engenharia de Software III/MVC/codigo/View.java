import java.util.List;

public interface View {
    void setIngresso(Ingresso ingresso);
    void update(List<Ingresso> ingressos);
    void emitirDadosSistema();
    void registrarIngresso();
}
