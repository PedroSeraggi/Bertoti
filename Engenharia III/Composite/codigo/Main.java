public class Main {
    public static void main(String[] args) {
        LojaEletronica loja = new LojaEletronica();

        Produto eletronico1 = new Eletronico("Samsung", "Galaxy S21", 999.99);
        Produto eletronico2 = new Eletronico("Apple", "MacBook Pro", 1499.99);

        loja.adicionarEletronico(eletronico1);
        loja.adicionarEletronico(eletronico2);

        loja.informacoesLoja();
    }
}