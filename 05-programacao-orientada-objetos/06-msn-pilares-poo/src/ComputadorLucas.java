public class ComputadorLucas {
    public static void main(String[] args) {
        RedesSociais redeSocial = null;

        String appEscolhido = "msn";

        switch (appEscolhido) {
            case "msn":
                redeSocial = new MsnMessenger();
                break;
            case "fbc":
                redeSocial = new Facebook();
                break;
            case "tlg":
                redeSocial = new Telegram();
                break;
            default:
                break;
        }

        redeSocial.enviarMensagem();
        redeSocial.receberMensagem();
    }
}
