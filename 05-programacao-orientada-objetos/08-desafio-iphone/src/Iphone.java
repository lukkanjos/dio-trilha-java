public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void pausar() {
        System.out.println("Pausando música");
        
    }

    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada");
        
    }

    public void tocar() {
        System.out.println("Tocando música");
        
    }

    public void atender() {
        System.out.println("Ligação atendida");
        
    }

    public void inicarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
        
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
        
    }

    public void adicionarNovaAba() {
        System.out.println("Aba adicionada");
        
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
        
    }

    public void exibirPagina(String url) {
        System.out.println("Pagina exiibida");
        
    }

}
