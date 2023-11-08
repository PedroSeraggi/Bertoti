public class SemDesconto implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor;
    }
}