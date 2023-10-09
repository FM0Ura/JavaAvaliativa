package espiritoguerreiro;

/*
Descrição do Comportamento das classes:

   
    ⮚ Método String vidaExtra(): Este método ler (obtido via teclado) um pedido de Misericórdia do Guerreiro por 
    mais UMA(1) Vida;
    ⮚ Método bool decidirVidaExtra(String Misericordia): Este método recebe o Pedido de Misericórdia do 
    Guerreiro e o Oráculo decide se concede ou não uma (1) Vida Extra. A vida extra será concedida se o 
    Pedido de Misericórdia do Guerreiro tiver mais que cinco palavras. 
    ⮚ Método String prologoVencedor(): Este método exibe na tela um Prólogo (com Nomes) do Oráculo para o 
    Guerreiro: VENCEDOR;
    ⮚ Método String prologoPerdedor(): Este método exibe na tela um Prólogo (com Nomes) do Oráculo para o 
    Guerreiro: PERDEDOR;

*/



/*
    * @author FM0ura
*/
public class EspiritoGuerreiro {
    public static void main(String[] args) {
        Oraculo o = new Oraculo();
        System.out.println(o.prologoIntroducao());
        //System.out.println(o.loadLevel1());
        System.out.println(o.loadLevel2());
        
        
    }
    
}
