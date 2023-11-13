import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TesteSistema {
    public static void main(String[] args) {
        Registro registro = new Registro();

        Sistema sistema1 = new Sistema("User1", new Date(), "Sessao1");
        Sistema sistema2 = new Sistema("User2", new Date(), "Sessao2");

        registro.addSistema(sistema1);
        registro.addSistema(sistema2);

        View view = new View() {
            private Ingresso ingresso;

            @Override
            public void setIngresso(Ingresso ingresso) {
                this.ingresso = ingresso;
            }

            @Override
            public void update(List<Ingresso> ingressos) {
            }

            @Override
            public void emitirDadosSistema() {
                System.out.println("Dados do sistema emitidos");
            }

            @Override
            public void registrarIngresso() {
                System.out.println("Ingresso registrado");
            }
        };

        Estoque estoque = new Estoque() {
            @Override
            public boolean verificarDisponibilidade() {
                return true;
            }
        };

        Ingresso comprouIngresso = new ComprouIngresso(view, estoque);

        view.setIngresso(comprouIngresso);

        comprouIngresso.comprarIngresso();

        Ingresso nãoComprouIngresso = new NãoComprouIngresso(view, estoque);

        view.setIngresso(nãoComprouIngresso);

        nãoComprouIngresso.comprarIngresso();
    }
}
