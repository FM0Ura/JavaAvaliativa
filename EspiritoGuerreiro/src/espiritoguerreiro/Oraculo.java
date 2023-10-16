package espiritoguerreiro;
import java.util.Random;

/**
 *
 * @author FM0ura
 */
public class Oraculo {
    private String nome;
    public Guerreiro warrior = new Guerreiro();
    
    
    public String prologoIntroducao(){
        nome = InOut.leString(" Bravo guerreiro, qual o nome do seu Oraculo? ");
        return "Bem vindo " + nome + ", que Deus estejam com voce em sua jornada! Com a benção que Ele te proporcionou você agora possui " + warrior.setVidas() + " vidas!";
    }
    public String prologoPerdedor(){

        
        
        
        return " ";
}
    public String prologoVencedor(){/*Método String prologoVencedor(): Este método exibe na tela um Prólogo (com Nomes) do Oráculo para o 
        Guerreiro: VENCEDOR;*/ 
        
        
        
        
        return " ";
    }
    public boolean loadLevel1(){
        // VARIÁVEIS
        Random geradorRandom = new Random();
        int palpite, senha, tentativa = 0;
        senha = geradorRandom.nextInt(101);
        boolean decisao;
        // ENTRADA
        palpite = InOut.leInt(nome + " descubra qual o segredo bravo guerreiro, apenas assim conseguirá prosseguir!\n A senha é um número entre 0 a 100: ");
        if(warrior.setVidas()-tentativa == 0){
            decisao = decidirVidaExtra(warrior.vidaExtra());
            if (decisao){
                tentativa = 1;
            while (tentativa != warrior.setVidas()) {            
                if (palpite == senha) {
                    System.out.println("Parabéns guerreiro, você acertou a senha");
                    return true;
                } else if (palpite > senha){
                    System.out.println("Infelizmente você errou, esse número é maior que a senha");
                    palpite = InOut.leInt(" Você possui mais " + (warrior.setVidas()-tentativa) + ". Faça seu próximo palpite: " );
                    tentativa++;
                } else if (palpite < senha) {
                    System.out.println("Infelizmente você errou, esse número é menor que a senha");
                    palpite = InOut.leInt(" Você possui mais " + (warrior.setVidas()-tentativa) + ". Faça seu próximo palpite: " );
                    tentativa++;
                }
            }
            }
        }
        else {
        // LOOP
        while (tentativa != warrior.setVidas()) {            
            if (palpite == senha) {
                System.out.println("Parabéns guerreiro, você acertou a senha");
                return true;
                } else if (palpite > senha){
                    System.out.println("Infelizmente você errou, esse número é maior que a senha");
                    palpite = InOut.leInt(" Você possui mais " + (warrior.setVidas()-tentativa) + ". Faça seu próximo palpite: " );
                    tentativa++;
                } else if (palpite < senha) {
                    System.out.println("Infelizmente você errou, esse número é menor que a senha");
                    palpite = InOut.leInt(" Você possui mais " + (warrior.setVidas()-tentativa) + ". Faça seu próximo palpite: " );
                    tentativa++;
                }
            }

        }
        
        System.out.println("Você morreu! Reinicie o jogo!");
        return false; 
        }
            
            
  
    }
    public boolean loadLevel2(){
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
    public boolean decidirVidaExtra(String frase){
        /*Método bool decidirVidaExtra(String Misericordia): Este método recebe o Pedido de Misericórdia do
        Guerreiro e o Oráculo decide se concede ou não uma (1) Vida Extra. A vida extra será concedida se o
        Pedido de Misericórdia do Guerreiro tiver mais que cinco palavras.*/
        String[] misericordia = frase.split(" ");
        if (misericordia.length > 5) {
            System.out.println("O senhor teu Deus reconheceu sua bravura e mediante a isso te provê uma chance de continuar tua jornada!");
            warrior.qtdVidas += 1;
            return true;
        } else{
            System.out.println("Você não tem mais nada para fazer na Terra. Sucumba!");
            return false;
        }
}
    
    
    
}
/*
Descrição do Comportamento das classes:

    ⮚ Método String vidaExtra(): Este método ler (obtido via teclado) um pedido de Misericórdia do Guerreiro por 
    mais UMA(1) Vida;

    ⮚ Método String prologoVencedor(): Este método exibe na tela um Prólogo (com Nomes) do Oráculo para o 
    Guerreiro: VENCEDOR;
    ⮚ Método String prologoPerdedor(): Este método exibe na tela um Prólogo (com Nomes) do Oráculo para o 
    Guerreiro: PERDEDOR;

*/
