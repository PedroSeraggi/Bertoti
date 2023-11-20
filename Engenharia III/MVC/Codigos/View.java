import java.util.List;

public abstract class View implements Observer {
    private Pedido ultimoPedido;
    private List<Funcionario> funcionarios;

    public void setUltimoPedido(Pedido pedido){
        this.ultimoPedido = pedido;
    }

    public void atualizar(List<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }
}
