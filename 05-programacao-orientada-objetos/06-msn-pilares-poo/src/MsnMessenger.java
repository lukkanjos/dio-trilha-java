public class MsnMessenger extends RedesSociais {
    public void enviarMensagem(){
        System.out.println("Enviando mensagem do MSN");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem do MSN");
        salvarHistoricoMensagem();
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando Histórico");
    }
}
