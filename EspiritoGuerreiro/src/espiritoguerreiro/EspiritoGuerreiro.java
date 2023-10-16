package espiritoguerreiro;

/**
 *
 * @author alunodev10
 */
public class EspiritoGuerreiro {
        public static void main(String[] args) {
        Oraculo o = new Oraculo();
        System.out.println(o.prologoIntroducao());
        System.out.println(o.loadLevel1());
        System.out.println(o.loadLevel2());
        System.out.println(o.decidirVidaExtra(o.warrior.vidaExtra()));
    }
}
/*
⮚ Método bool decidirVidaExtra(String Misericordia): Este método recebe o Pedido de Misericórdia do 
Guerreiro e o Oráculo decide se concede ou não uma (1) Vida Extra. A vida extra será concedida se o 
Pedido de Misericórdia do Guerreiro tiver mais que cinco palavras. 

⮚ Método String prologoPerdedor(): Este método exibe na tela um Prólogo (com Nomes) do Oráculo para o 
Guerreiro: PERDEDOR;
*/