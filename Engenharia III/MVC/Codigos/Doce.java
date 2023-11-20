public abstract class Doce implements Pedido {
    private View view;
    private Cafeteria cafeteria;

    public void setVisualizador(View view){
        this.view = view;
    }

    public void anotarPedido(){
        System.out.println("Pedido Anotado!");
    }
}
