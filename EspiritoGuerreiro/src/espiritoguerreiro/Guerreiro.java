package espiritoguerreiro;
import java.util.Random;
/*

* @author FM0ura

*/
public class Guerreiro {
    private String nome;
    public int qtdVidas;
    
    public String vidaExtra(){
        /*⮚ Método String vidaExtra(): Este método ler (obtido via teclado) um pedido de Misericórdia do Guerreiro por 
    mais UMA(1) Vida;*/
        String misericordia;
        misericordia = InOut.leString("Você está prestes a ir para o submundo, mas caso convença o teu Criador de que sua vida ainda é necessária na Terra conseguirá mais um vida! Convença o Criador: ");
        return misericordia;
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
        
        