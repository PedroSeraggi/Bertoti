public class Desconto20Porcento implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.8; // 20% de desconto
    }
}