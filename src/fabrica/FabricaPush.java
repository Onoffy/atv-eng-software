package fabrica;

import notificacao.Notificacao;
import notificacao.NotificacaoPush;

public class FabricaPush extends FabricaNotificacao{

    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoPush();
    }

}
