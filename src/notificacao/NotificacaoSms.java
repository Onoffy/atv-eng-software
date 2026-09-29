package notificacao;

public class NotificacaoSms implements Notificacao {

    @Override
    public void enviar (String mensagem) {
        System.out.println("Notificação SMS: " + mensagem);
    }

}
