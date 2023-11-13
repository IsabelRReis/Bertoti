import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int pedidoCounter = 0;
    private int id;
    private Cliente cliente;
    private List<Item> itens;

    public Pedido(Cliente cliente, List<Item> itens) {
        this.id = ++pedidoCounter;
        this.cliente = cliente;
        this.itens = new ArrayList<>(itens);
    }

    public static Pedido getPedidoById(int pedidoId) {
        return null;
    }
}