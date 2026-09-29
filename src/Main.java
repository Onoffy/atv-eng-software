import fabrica.FabricaEmail;
import fabrica.FabricaNotificacao;
import fabrica.FabricaPush;
import fabrica.FabricaSms;

public class Main {

    public static void main(String[] args) {

        FabricaNotificacao fabricaEmail = new FabricaEmail();
        fabricaEmail.enviarNotificacao("Pix de R$1000,00 recebido");

        FabricaNotificacao fabricaSms = new FabricaSms();
        fabricaSms.enviarNotificacao("1 mensagem recebida da Claro");

        FabricaNotificacao fabricaPush = new FabricaPush();
        fabricaPush.enviarNotificacao("Novo vídeo enviado pela RGG Studio no YouTube!");

    }

}
