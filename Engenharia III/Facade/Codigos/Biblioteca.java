import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> estoque;

    public Biblioteca() {
        estoque = new ArrayList<>();
        // Adicione alguns livros ao estoque
        estoque.add(new Livro("Livro 1"));
        estoque.add(new Livro("Livro 2"));
     
    }

    public Livro buscarLivro(String tituloLivro) {
        for (Livro livro : estoque) {
            if (livro.getTitulo().equalsIgnoreCase(tituloLivro)) {
                return livro;
            }
        }
        return null;
    }

    public void emprestarLivro(String tituloLivro) {
        Livro livro = buscarLivro(tituloLivro);
        if (livro != null) {
            if (livro.isDisponivel()) {
                livro.setDisponivel(false); 
               
            } else {
                System.out.println("O livro " + tituloLivro + " não está disponível para empréstimo.");
            }
        }
    }
    
    public void devolverLivro(String tituloLivro) {
        Livro livro = buscarLivro(tituloLivro);
        if (livro != null) {
            livro.setDisponivel(true); 
        }
    }
}