
import java.util.List;

public class View implements Observer {
    private Controlador controlador;

    public View(Controlador controlador) {
        this.controlador = controlador;
        controlador.attach(this);
    }

    public void update(Subject subject) {
        if (subject instanceof Controlador) {
            update();
        }
    }

    public void update() {
        List<Pedido> pedidos = controlador.getUltimosPedidos();
        System.out.println("Novo Pedido Registrado:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
