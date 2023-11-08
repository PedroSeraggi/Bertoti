import java.util.ArrayList;
import java.util.List;

public class Controlador extends Subject {
    private List<Pedido> pedidos = new ArrayList<>();

    public void realizarPedido(Cliente cliente, List<Produto> produtos) {
        Pedido pedido = new Pedido(cliente, produtos);
        pedidos.add(pedido);
        notifyObservers();
    }

    public List<Pedido> getUltimosPedidos() {
        return pedidos;
    }
}
