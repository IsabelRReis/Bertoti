import java.util.List;

public class LojaOnline {
    public Pedido emitirPedido(Cliente cliente, List<Item> itens) {
        if (validarCompra(cliente, itens)) {
            Pedido pedido = new Pedido(cliente, itens);
            processarPagamento(pedido.getId(), somarPreço(itens));
            return pedido;
        } else {
            System.out.println("Compra inválida. Verifique o estoque ou o saldo do cliente.");
            return null;
        }
    }

    public Pedido acompanharPedido(int pedidoId) {
        return Pedido.getPedidoById(pedidoId);
    }

    public double somarPreço(List<Item> itens) {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getPreço();
        }
        return total;
    }

    public boolean verificarEstoque(List<Item> itens) {
        for (Item item : itens) {
            if (!Estoque.verificar(item)) {
                return false;
            }
        }
        return true;
    }

    public void processarPagamento(int pedidoId, double valor) {
        Pagamento.efetuarPagamento(pedidoId, valor);
    }

    public boolean validarCompra(Cliente cliente, List<Item> itens) {
        if (verificarEstoque(itens) && cliente.getSaldo() >= somarPreço(itens)) {
            return true;
        } else {
            return false;
        }
    }
}
