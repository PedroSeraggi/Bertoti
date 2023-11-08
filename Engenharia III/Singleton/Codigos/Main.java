public class Main {
    public static void main(String[] args) {
   
        ConfiguracoesGlobais configuracoes = ConfiguracoesGlobais.getInstance();

       
        System.out.println("Idioma atual: " + configuracoes.getIdioma());
        System.out.println("Tamanho da fonte: " + configuracoes.getTamanhoFonte());

      
        configuracoes.setIdioma("Inglês");
        configuracoes.setTamanhoFonte(14);

     
        System.out.println("Idioma atual: " + configuracoes.getIdioma());
        System.out.println("Tamanho da fonte: " + configuracoes.getTamanhoFonte());
    }
}