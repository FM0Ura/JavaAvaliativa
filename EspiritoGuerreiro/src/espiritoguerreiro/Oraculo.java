package espiritoguerreiro;

/**
 *
 * @author FM0ura
 */
public class Oraculo {
    private String nome;
    private Guerreiro warrior = new Guerreiro();
    
    
    public String prologoIntroducao(){
        nome = InOut.leString(" Bravo guerreiro, qual o nome do seu Oraculo? ");
        int vidas = warrior.setVidas();
        return "Bem vindo " + nome + ", que Deus estejam com voce em sua jornada! Com a benção que Ele te proporcionou você agora possui " + vidas + " vidas!";
    }
    public String prologoPerdedor(){/* CODE */ return " ";}
    public String prologoVencedor(){/* CODE */ return " ";}
    public boolean loadLevel1(){/* CODE */ return true;}
    public boolean loadLevel2(){/* CODE */ return true;}
    public boolean decidirVidaExtra(String frase){/* CODE */ return true;}
    
    
    
}
