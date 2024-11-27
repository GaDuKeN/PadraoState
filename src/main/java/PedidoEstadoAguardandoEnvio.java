public class PedidoEstadoAguardandoEnvio extends PedidoEstado {

    private PedidoEstadoAguardandoEnvio() {};
    private static PedidoEstadoAguardandoEnvio instance = new PedidoEstadoAguardandoEnvio();
    public static PedidoEstadoAguardandoEnvio getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aguardando Envio";
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        return true;
    }
}
