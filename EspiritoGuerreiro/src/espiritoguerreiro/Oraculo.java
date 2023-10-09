package espiritoguerreiro;
import java.util.Random;

/**
 *
 * @author FM0ura
 */
public class Oraculo {
    private String nome;
    private Guerreiro warrior = new Guerreiro();
    int vidas; // PODE ESSA VARIÁVEL???
    
    
    public String prologoIntroducao(){
        nome = InOut.leString(" Bravo guerreiro, qual o nome do seu Oraculo? ");
        vidas = warrior.setVidas();
        return "Bem vindo " + nome + ", que Deus estejam com voce em sua jornada! Com a benção que Ele te proporcionou você agora possui " + vidas + " vidas!";
    }
    public String prologoPerdedor(){/* CODE */ return " ";}
    public String prologoVencedor(){/* CODE */ return " ";}
    public boolean loadLevel1(){
        // VARIÁVEIS
        Random geradorRandom = new Random();
        int palpite, senha, tentativa = 0;
        senha = geradorRandom.nextInt(101);
        // ENTRADA
        palpite = InOut.leInt(nome + " descubra qual o segredo bravo guerreiro, apenas assim conseguirá prosseguir!\n A senha é um número entre 0 a 100: ");
        
        // LOOP
        while (tentativa != vidas) {            
            if (palpite == senha) {
                System.out.println("Parabéns guerreiro, você acertou a senha");
                return true;
            } else if (palpite > senha){
                System.out.println("Infelizmente você errou, esse número é maior que a senha");
                palpite = InOut.leInt(" Você possui mais " + (vidas-tentativa) + ". Faça seu próximo palpite: " );
                tentativa++;
            } else if (palpite < senha) {
                System.out.println("Infelizmente você errou, esse número é menor que a senha");
                palpite = InOut.leInt(" Você possui mais " + (vidas-tentativa) + ". Faça seu próximo palpite: " );
                tentativa++;
            }
        }
        
        System.out.println("Você morreu! Reinicie o jogo!");
        return false;   
    }
    public boolean loadLevel2(){
        /* ⮚ Método int loadLevel2(int opcao): Este método faz um jogo de PAR ou ÍMPAR com o Oráculo. O Guerreiro 
    decide na variável Opção: PAR ou ÍMPAR e o método retorna se o Guerreiro Ganhou ou Perdeu: SE a 
    SOMA deu PAR ou ÍMPAR. O Oráculo e O Guerreiro irão receber números sorteados entre [0, 5].*/
        // GERADORES
        Random geradorGuerreiroRandom = new Random();
        Random geradorOraculoRandom = new Random();
        // VARIÁVEIS
        int guerreiroRandom, oraculoRandom, soma;
        String decisao;
        
        guerreiroRandom = geradorGuerreiroRandom.nextInt(6);
        oraculoRandom = geradorOraculoRandom.nextInt(6);
        
        decisao = InOut.leString("Nesse nível você precisará passar por um partida de PAR ou ÍMPAR. Qual opção você prefere apostar? (Digite 'IMPAR' ou 'PAR')");
        soma = guerreiroRandom + oraculoRandom;
        if ("PAR".equals(decisao)) {
            if (soma % 2 == 0){
                System.out.println("Parabéns! Você GANHOU!");
                return true;
            } else {
                System.out.println("Infelizmente! Você PERDEU!");
                return false;
            }
        } else if ("IMPAR".equals(decisao)){
            if (soma % 2 != 0){
                System.out.println("Parabéns! Você GANHOU!");
                return true;
            } else{
                System.out.println("Infelizmente! Você PERDEU!");
                return false;
            }
            
            } else{
                System.out.println("OPÇÃO INVÁLIDA!");
            }
        
        
        
        
        
        
        
        
        
        return true;
    }
    public boolean decidirVidaExtra(String frase){/* CODE */ return true;}
    
    
    
}
/*
Descrição do Comportamento das classes:

    
    pelo Guerreiro. Cada erro do Guerreiro é uma vida a menos!
    ⮚ Método int loadLevel2(int opcao): Este método faz um jogo de PAR ou ÍMPAR com o Oráculo. O Guerreiro 
    decide na variável Opção: PAR ou ÍMPAR e o método retorna se o Guerreiro Ganhou ou Perdeu: SE a 
    SOMA deu PAR ou ÍMPAR. O Oráculo e O Guerreiro irão receber números sorteados entre [0, 5].
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
