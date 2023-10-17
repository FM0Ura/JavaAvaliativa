package espiritoguerreiro;
import java.util.Random;
/*

* @author FM0ura

*/
public class Guerreiro {
    private String nome;
    public int qtdVidas;
    
    // Não está sendo utilizada a variavel String nome;
    /*public void setNome(String Nome){
        Nome = InOut.leString("Oráculo, qual o nome de teu guerreiro?");
        nome = Nome;
    }
    */
    // vidaExtra() -- FUNCIONANDO
    public String vidaExtra(){
        String misericordia;
        misericordia = InOut.leString("Você está prestes a ir para o submundo, mas caso convença o teu Criador de que sua vida ainda é necessária na Terra conseguirá mais um vida! Convença o Criador: ");
        return misericordia;
    }
    // setVidas() -- FUNCIONANDO
    public int setVidas(){
        Random geradorRandom = new Random();
        int vidas = geradorRandom.nextInt(13);
        if (vidas < 9){
            while (vidas < 9){
                vidas = geradorRandom.nextInt(13);
            }
        }
        System.out.println("A quantidade de vidas de " + nome + " é " + qtdVidas);
            return vidas;
    }

}