public class CarrinhoDeCompras {
    private EstrategiaDesconto estrategiaDesconto;
    
    public CarrinhoDeCompras(EstrategiaDesconto estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }
    
    public void setEstrategiaDesconto(EstrategiaDesconto estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }
    
    public double calcularValorComDesconto(double valor) {
        return estrategiaDesconto.calcularDesconto(valor);
    }
}