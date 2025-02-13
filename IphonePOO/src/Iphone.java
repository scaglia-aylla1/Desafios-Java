public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
      // Implementando métodos de ReprodutorMusical
      @Override
      public void tocar() {
          System.out.println("Tocando música...");
      }
  
      @Override
      public void pausar() {
          System.out.println("Música pausada.");
      }
  
      @Override
      public void selecionarMusica(String musica) {
          System.out.println("Selecionando música: " + musica);
      }
  
      // Implementando métodos de AparelhoTelefonico
      @Override
      public void ligar(String numero) {
          System.out.println("Ligando para: " + numero);
      }
  
      @Override
      public void atender() {
          System.out.println("Atendendo chamada...");
      }
  
      @Override
      public void iniciarCorreioVoz() {
          System.out.println("Iniciando correio de voz...");
      }
  
      // Implementando métodos de NavegadorInternet
      @Override
      public void exibirPagina(String url) {
          System.out.println("Exibindo página: " + url);
      }
  
      @Override
      public void adicionarNovaAba() {
          System.out.println("Adicionando uma nova aba...");
      }
  
      @Override
      public void atualizarPagina() {
          System.out.println("Atualizando página...");
      }

}
