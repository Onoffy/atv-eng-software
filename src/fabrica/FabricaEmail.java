package fabrica;

import notificacao.Notificacao;
import notificacao.NotificacaoEmail;

public class FabricaEmail extends FabricaNotificacao{

    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }

}
