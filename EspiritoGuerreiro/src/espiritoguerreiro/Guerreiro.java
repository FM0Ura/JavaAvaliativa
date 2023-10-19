// IMPORTAÇÕES
package espiritoguerreiro;
import java.util.Random;

/** @author FM0ura */

public class Guerreiro {
    private String nome;
    public int qtdVidas;

    // CONSTRUTOR.
    public Guerreiro(String nome) {
        this.nome = nome;
        this.qtdVidas = setVidas();
    }

    // OBTER QUANTIDADE DE VIDA.
    public int getQtdVidas() {
        return qtdVidas;
    }

    // DEFINIR QUANTIDADE DE VIDA.
    public int setVidas() {
        Random random = new Random();
        return random.nextInt(4) + 9;
    }

    // SOLICITAR VIDA EXTRA PARA ORÁCULO
    public void vidaExtra(Oraculo oraculo) {
        String misericordia = InOut.leString("Guerreiro, você anseia pela misericórdia divina para com sua vida? ");

        boolean concederVidaExtra = oraculo.decidirVidaExtra(misericordia);

        if (concederVidaExtra) {
            qtdVidas = 1;
            InOut.MsgDeInformacao("REDENÇÃO","Guerreiro, você ganhou uma vida extra! Agora você tem " + qtdVidas + " vidas.");
        } else {
            InOut.MsgDeInformacao("PERDIÇÃO","Volte para debaixo da terra, de onde nunca deveria ter saído!");
        }
    }


}