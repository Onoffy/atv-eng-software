package notificacao;

public class NotificacaoEmail implements Notificacao {

    @Override
    public void enviar (String mensagem) {
        System.out.println("Notificação de Email: " + mensagem);
    }

}
