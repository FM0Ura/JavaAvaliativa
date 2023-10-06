package espiritoguerreiro;
import java.util.Random;
/*

* @author FM0ura

*/
public class Guerreiro {
    private String nome;
    private int qtdVidas;
    
    public String vidaExtra(){
        return "";
    }
    public int setVidas(){
        Random geradorRandom = new Random();
        int vidas = geradorRandom.nextInt(12);
        if (vidas < 9){
            while (vidas < 9){
                vidas = geradorRandom.nextInt(12);
            }
        }
            return vidas;
    }
}
        
        