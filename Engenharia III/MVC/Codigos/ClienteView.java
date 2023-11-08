import java.util.List;

public class ClienteView implements Observer {
    private Controlador controlador;

    public ClienteView(Controlador controlador) {
        this.controlador = controlador;
        controlador.attach(this);
    }

    @Override
    public void update(Subject subject) {
        List<Pedido> pedidos = controlador.getUltimosPedidos();
        for (Pedido pedido : pedidos) {
            if (pedido.getCliente().toString().equals("Cliente VIP")) {
                System.out.println("Cliente VIP fez um pedido: " + pedido);
            }
        }
    }
}
