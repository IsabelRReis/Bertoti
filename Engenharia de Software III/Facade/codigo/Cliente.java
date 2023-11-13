import java.util.List;

public class Cliente {
    private double saldo;

    public Cliente(double saldo) {
        this.saldo = saldo;
    }

    public Pedido fazerPedido(List<Item> itens) {
        return new Pedido(this, itens);
    }

    public void finalizarCompra() {
    }

    public double getSaldo() {
        return saldo;
    }

    public Pedido acompanharPedido(int pedidoId) {
        return Pedido.getPedidoById(pedidoId);
    }
}