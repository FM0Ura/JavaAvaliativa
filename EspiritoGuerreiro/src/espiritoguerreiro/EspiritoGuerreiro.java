package espiritoguerreiro;

/**
 *
 * @author alunodev10
 */
public class EspiritoGuerreiro {
        public static void main(String[] args) {
        Oraculo o = new Oraculo();
        o.setNome("");
        o.warrior.setVidas();
        System.out.println(o.prologoIntroducao());
        System.out.println(o.loadLevel1());
        //System.out.println(o.loadLevel2());
        //System.out.println(o.decidirVidaExtra(o.warrior.vidaExtra()));
    }
}
/*

Descrição do Comportamento das classes:


Na classe Principal (main), faça a instância de um Objeto: Oráculo Master e jogando no MÍNIMO UMA (1) PARTIDA, 
exibe todo seu Estado + Comportamento, conforme o descritivo do jogo
*/