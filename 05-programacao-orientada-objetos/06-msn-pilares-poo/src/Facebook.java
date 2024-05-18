public class Facebook extends RedesSociais {
    public void enviarMensagem(){
        System.out.println("Enviando mensagem do Facebook");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem do Facebook");
        salvarHistoricoMensagem();
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando Histórico");
    }
    
}
