package espiritoguerreiro;
import java.util.Random;

/** @author FM0ura */

public class Oraculo {
    private String nome;
    public Guerreiro warrior = new Guerreiro("Berseker");

    // MÉTODO DEFINIR NOME
    public void setNome(){
        nome = InOut.leString("Olá Oráculo qual o seu nome?");
    }

    // MÉTODO EXIBIR INFOS
    public String prologoIntroducao() {
        InOut.MsgDeAviso("Introdução","Olá, Guerreiro, Eu sou o Oráculo " + (nome) + ". Você parece ter coragem o suficiente para encarar esta jornada. Atualmente, você possui " + warrior.getQtdVidas() + " vidas. Vamos prosseguir...");
        return "Olá, Guerreiro, Eu sou o Oráculo " + nome + ". Você parece ter coragem o suficiente para encarar esta jornada. Atualmente, você possui " + warrior.getQtdVidas() + " vidas. Vamos prosseguir...";
    }

    // MÉTODO DO LEVEL 1
    public int loadLevel1() {
        Random random = new Random();
        int segredo = random.nextInt(100) + 1; // GERADOR ALEATÓRIO DE 1 A 100

        int palpite;
        int vidas = warrior.getQtdVidas();
        boolean concedeuVidaExtra = false; // CONTROLE DE VIDA EXTRA

        InOut.MsgDeInformacao("LEVEL 1", "Nessa caverna há um segredo. Tente adivinhá-lo!");
        InOut.MsgDeInformacao("LEVEL 1", "(DIGITE NÚMEROS DE 1 a 100)");

        do {
            palpite = InOut.leInt("Guerreiro, faça o seu palpite: ");
            if (palpite < segredo) {
                InOut.MsgDeAviso("ERRADO!", "O segredo é MAIOR do que o seu palpite!\nVocê agora tem " + (vidas - 1) + " vidas restantes.");
            } else if (palpite > segredo) {
                InOut.MsgDeAviso("ERRADO!", "O segredo é MENOR do que o seu palpite!\nVocê agora tem " + (vidas - 1) + " vidas restantes.");
            } else {
                InOut.MsgSemIcone("ACERTOU!", "Você apenas teve sorte... Você acertou o segredo!");
                break;
            }

            vidas--;

            if (vidas == 0 && !concedeuVidaExtra) {
                InOut.MsgDeAviso("VIDAS ESGOTADAS!", "Você perdeu todas as vidas. Pedindo Misericórdia...");
                warrior.vidaExtra(this); // Chama o método vidaExtra para pedir uma vida extra
                concedeuVidaExtra = true;
                vidas++; // Incrementa a vida extra
            } else if (vidas == 0) {
                InOut.MsgDeErro("GAME OVER", "Suas vidas se esgotaram. O segredo era " + segredo + ".");
                prologoPerdedor();
                break;
            }
        } while (vidas > 0);

        return vidas;
    }


    // MÉTODO DO LEVEL 2

    public int loadLevel2() {
        Random random = new Random();
        int guerreiroEscolha = random.nextInt(6); // GERADOR DE 0 A 5 DO GUERREIRO
        int oraculoEscolha = random.nextInt(6);    // GERADOR DE 0 A 5 DO ORÁCULO
        int soma = guerreiroEscolha + oraculoEscolha;
        int vidas = warrior.getQtdVidas();
        boolean concedeuVidaExtra = false; // CONTROLE DE VIDA EXTRA

        InOut.MsgDeInformacao("LEVEL 2", "Vamos jogar PAR ou ÍMPAR. Guerreiro, escolha PAR ou ÍMPAR.");

        String opcao = InOut.leString("Guerreiro, escolha PAR ou ÍMPAR: ");

        if ((opcao.equalsIgnoreCase("PAR") && soma % 2 == 0) || (opcao.equalsIgnoreCase("ÍMPAR") && soma % 2 != 0)) {
            InOut.MsgDeAviso("VOCÊ VENCEU!", "A soma deu " + (soma % 2 == 0 ? "PAR" : "ÍMPAR") + ".");
            prologoVencedor();
        } else {
            InOut.MsgDeErro("VOCÊ PERDEU!", "A soma deu " + (soma % 2 == 0 ? "PAR" : "ÍMPAR") + ". Pedindo Misericórdia...");
            vidas--;

            if (vidas == 0) {
                if (concedeuVidaExtra == false) {
                    InOut.MsgDeAviso("VIDAS ESGOTADAS!", "Você perdeu todas as vidas. Pedindo Misericórdia...");
                    warrior.vidaExtra(this);
                    concedeuVidaExtra = true;
                    vidas++;
                } else {
                    InOut.MsgDeErro("GAME OVER", "Suas vidas se esgotaram. Fim do Jogo.");
                    prologoPerdedor();
                    return 0;
                }
            }
        }

        return vidas;
    }



    // MÉTODO PARA VERIFICAR O PEDIDO DE MISERICÓRDIA DO GUERREIRO
    public boolean decidirVidaExtra(String misericordia) {
        return misericordia.split(" ").length > 5;
    }

    // PROLOGO PARA QUANDO VENCER
    public String prologoVencedor() {
        InOut.MsgDeAviso("VENCEDOR!", "Parabéns, Guerreiro! Você é um VENCEDOR! Continue sua jornada com coragem e determinação.");
        return "Guerreiro VENCEU!";
    }

    // PROLOGO PARA QUANDO PERDER
    public String prologoPerdedor() {
        InOut.MsgDeAviso("PERDEDOR!", "Volte para de baixo da terra de onde nunca deveria ter saído!");
        return "Guerreiro PERDEU!";
    }
}
