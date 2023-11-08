public class ConfiguracoesGlobais {
    private static ConfiguracoesGlobais instance;
    private String idioma;
    private int tamanhoFonte;

    private ConfiguracoesGlobais() {
        idioma = "Português";
        tamanhoFonte = 12;
    }

    public static ConfiguracoesGlobais getInstance() {
        if (instance == null) {
            instance = new ConfiguracoesGlobais();
        }
        return instance;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String novoIdioma) {
        idioma = novoIdioma;
    }

    public int getTamanhoFonte() {
        return tamanhoFonte;
    }

    public void setTamanhoFonte(int novoTamanhoFonte) {
        tamanhoFonte = novoTamanhoFonte;
    }
}