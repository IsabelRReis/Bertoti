public class TesteLojaOnline {
    public static void main(String[] args) {
        LojaOnline loja = new LojaOnline();
        Cliente cliente = new Cliente();
        List<Item> itens = Arrays.asList(new Item("ProdutoA", 10.0), new Item("ProdutoB", 20.0));

        Pedido pedido = loja.emitirPedido(cliente, itens);

        if (pedido != null) {
            cliente.acompanharPedido(pedido.getId());
        }
    }
}