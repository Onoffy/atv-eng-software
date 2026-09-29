package notificacao;

public class NotificacaoPush implements Notificacao {

    @Override
    public void enviar (String mensagem) {
        System.out.println("Notificação Push: " + mensagem);
    }

}
