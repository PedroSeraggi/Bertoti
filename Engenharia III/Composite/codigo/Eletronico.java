public class Eletronico implements Produto {
    private String marca;
    private String modelo;
    private double preco;

    public Eletronico(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public void comprar() {
        System.out.println("Comprando o eletrônico: Marca - " + marca + ", Modelo - " + modelo + ", Preço - " + preco);
    }

    public double getValorProduto() {
        return preco;
    }
}