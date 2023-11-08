import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controlador controller = new Controlador();
        View view = new View(controller);
        ClienteView clienteView = new ClienteView(controller);

        Produto produto1 = new Produto("Café", 5.0);
        Produto produto2 = new Produto("Bolo", 3.0);
        Produto produto3 = new Produto("Leite", 2.0);

        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente VIP");

        List<Produto> produtos1 = new ArrayList<>();
        produtos1.add(produto1);
        produtos1.add(produto2);

        List<Produto> produtos2 = new ArrayList<>();
        produtos2.add(produto1);
        produtos2.add(produto3);

        controller.realizarPedido(cliente1, produtos1);

        // Criando um segundo pedido para um cliente diferente
        controller.realizarPedido(cliente2, produtos2);
    }
}
