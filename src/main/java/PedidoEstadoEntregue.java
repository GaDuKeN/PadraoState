public class PedidoEstadoEntregue extends PedidoEstado {

    private PedidoEstadoEntregue() {};
    private static PedidoEstadoEntregue instance = new PedidoEstadoEntregue();
    public static PedidoEstadoEntregue getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Entregue";
    }

    public boolean finalizar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoFinalizado.getInstance());
        return true;
    }
}
