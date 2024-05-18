public class Telegram extends RedesSociais {
    public void enviarMensagem(){
        System.out.println("Enviando mensagem do Telegram");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem do Telegram");
        salvarHistoricoMensagem();
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando Histórico");
    }
}
