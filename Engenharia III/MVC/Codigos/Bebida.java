public abstract class Bebida implements Pedido {
    private View view;
    private Cafeteria cafeteria;

    public void anotarPedido(){
        System.out.println("Pedido Anotado!");
    }

    public void setVisualizador(View view){
        this.view = view;
    }
}
