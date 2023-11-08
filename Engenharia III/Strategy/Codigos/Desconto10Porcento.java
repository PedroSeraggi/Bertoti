public class Desconto10Porcento implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.9; // 10% de desconto
    }
}