public class Pedido {

    private String numero;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoAguardandoEnvio.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public boolean aguardarEnvio() {
        return estado.aguardarEnvio(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean devolver() {
        return estado.devolver(this);
    }

    public boolean finalizar() {
        return estado.finalizar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}
