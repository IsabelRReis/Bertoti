import java.util.List;

public class Vendedor {
    public Pedido emitirPedido(Cliente cliente, List<Item> itens) {
        if (cliente != null && itens != null && !itens.isEmpty()) {
            return new Pedido(cliente, itens);
        }
        return null;
    }

    public void enviarItens(Pedido pedido) {
        if (pedido != null) {
        }
    }
}
