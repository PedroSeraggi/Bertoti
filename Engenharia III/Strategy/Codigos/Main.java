public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(new SemDesconto());
        
        double valorOriginal = 100.0;
        
        System.out.println("Valor original: " + valorOriginal);
        System.out.println("Valor com desconto: " + carrinho.calcularValorComDesconto(valorOriginal));
        
        carrinho.setEstrategiaDesconto(new Desconto10Porcento());
        System.out.println("Valor com desconto: " + carrinho.calcularValorComDesconto(valorOriginal));
        
        carrinho.setEstrategiaDesconto(new Desconto20Porcento());
        System.out.println("Valor com desconto: " + carrinho.calcularValorComDesconto(valorOriginal));
    }
}