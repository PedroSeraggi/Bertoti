public class BibliotecaFacade {
    private Envio envio;
    private Estoque estoque;

    public BibliotecaFacade() {
        envio = new Envio();
        estoque = new Estoque();
    }

    public void emprestarLivro(String tituloLivro, String nomeUsuario) {
        System.out.println("Realizando empréstimo do livro: " + tituloLivro + " para o usuário: " + nomeUsuario);
        estoque.verificar();
        Livro livro = buscarLivro(tituloLivro);
        if (livro != null) {
            System.out.println("Livro encontrado: " + livro.getTitulo());
            envio.enviar();
            System.out.println("Empréstimo concluído.");
        } else {
            System.out.println("Livro não encontrado na biblioteca.");
        }
    }

    public void devolverLivro(String tituloLivro, String nomeUsuario) {
        System.out.println("Devolvendo o livro: " + tituloLivro + " por " + nomeUsuario);
        Livro livro = buscarLivro(tituloLivro);
        if (livro != null) {
            System.out.println("Livro encontrado: " + livro.getTitulo());
            
            System.out.println("Devolução concluída.");
        } else {
            System.out.println("Livro não encontrado na biblioteca.");
        }
    }

    private Livro buscarLivro(String tituloLivro) {
        return new Livro(tituloLivro);
    }
}
