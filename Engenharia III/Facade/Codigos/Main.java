public class Main {
    public static void main(String[] args) {
        BibliotecaFacade biblioteca = new BibliotecaFacade();
        String nomeUsuario = "Alice";
        String tituloLivro = "O Livro do Java"; // Substitua com o título do livro desejado

        biblioteca.emprestarLivro(tituloLivro, nomeUsuario);
        biblioteca.devolverLivro(tituloLivro, nomeUsuario);
    }
}





