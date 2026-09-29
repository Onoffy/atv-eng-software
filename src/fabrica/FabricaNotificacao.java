package fabrica;

import notificacao.Notificacao;

public abstract class FabricaNotificacao {

    public abstract Notificacao criarNotificacao();

    public void enviarNotificacao(String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
    }

}
