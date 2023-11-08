import java.util.ArrayList;
import java.util.List;

public class LojaEletronica {
    private List<Produto> eletronicos = new ArrayList<>();

    public void adicionarEletronico(Produto eletronico) {
        eletronicos.add(eletronico);
    }

    public void removerEletronico(Produto eletronico) {
        eletronicos.remove(eletronico);
    }

    public void informacoesLoja() {
        System.out.println("Produtos Eletrônicos na Loja:");
        for (Produto eletronico : eletronicos) {
            eletronico.comprar();
        }
    }
}