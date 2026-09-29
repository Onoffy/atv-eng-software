package fabrica;

import notificacao.Notificacao;
import notificacao.NotificacaoSms;

public class FabricaSms extends FabricaNotificacao{

    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoSms();
    }
}
