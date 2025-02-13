public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();

        // Testando funcionalidades do ReprodutorMusical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando funcionalidades do AparelhoTelefonico
        meuIphone.ligar("123-456-789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades do NavegadorInternet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
    
}
