package espiritoguerreiro;
import java.util.Random;

/**
 *
 * @author FM0ura
 */
public class Oraculo {
    private String nome;
    public Guerreiro warrior = new Guerreiro();
/*
    // ORACULO:
    ⮚ Método int loadLevel2(int opcao): Este método faz um jogo de PAR ou ÍMPAR com o Oráculo. O Guerreiro 
    decide na variável Opção: PAR ou ÍMPAR e o método retorna se o Guerreiro Ganhou ou Perdeu: SE a 
    SOMA deu PAR ou ÍMPAR. O Oráculo e O Guerreiro irão receber números sorteados entre [0, 5].

    ⮚ Método bool decidirVidaExtra(String Misericordia): Este método recebe o Pedido de Misericórdia do 
    Guerreiro e o Oráculo decide se concede ou não uma (1) Vida Extra. A vida extra será concedida se o 
    Pedido de Misericórdia do Guerreiro tiver mais que cinco palavras. 



    ⮚ Método String prologoVencedor(): Este método exibe na tela um Prólogo (com Nomes) do Oráculo para o 
    Guerreiro: VENCEDOR;

    ⮚ Método String prologoPerdedor(): Este método exibe na tela um Prólogo (com Nomes) do Oráculo para o 
    Guerreiro: PERDEDOR;
*/
    // setNome() -- FUNCIONANDO
    // QUERO TIRAR O PARAMETRO PARA USAR O IN/OUT
    public void setNome(String Nome){
        /* ⮚ Método void setNome(String Nome): Este método é para setar o Nome do Oráculo;*/
        Nome = InOut.leString("Qual o nome do Oráculo?");
        nome = Nome;
    }

    
    // prologoIntroducao() -- FUNCIONANDO
    public String prologoIntroducao(){
        /*
        ⮚ Método String prologoIntroducao(): Este método exibe na tela um Prólogo (com Nomes) do Oráculo para o 
        Guerreiro + A quantidade de vidas do Guerreiro;
        */
        InOut.MsgDeInformacao("Introdução","Bem vindo grande Oráculo " + nome + ", que Deus esteja com você e seu Guerreiro durante sua jornada! Com a benção que Ele proporcionou a vocês seu Guerreiro possui " + warrior.setVidas() + " vidas!");
        return "Bem vindo grande Oráculo " + nome + ", que Deus esteja com você e seu Guerreiro durante sua jornada! Com a benção que Ele proporcionou a vocês seu Guerreiro possui " + warrior.setVidas() + " vidas!";
    }
    
    
    public String prologoPerdedor(){

        
        
        
        return " ";
}
    
    public String prologoVencedor(){/*Método String prologoVencedor(): Este método exibe na tela um Prólogo (com Nomes) do Oráculo para o 
        Guerreiro: VENCEDOR;*/ 
        
        
        
        
        return " ";
    }
    public boolean loadLevel1(){
        /*
        ⮚ Método int loadLevel1(): Este método faz o sorteio de um Número entre [1, 100]. O Oráculo deve dar uma 
        dica ao Guerreiro: Segredo é MENOR ou MAIOR que o PALPITE do número escolhido (obtido via teclado) 
        pelo Guerreiro. Cada erro do Guerreiro é uma vida a menos!
        */
        // VARIÁVEIS
        Random geradorRandom = new Random();
        int palpite, senha, tentativa = 0;
        senha = geradorRandom.nextInt(101);

        // ENTRADA
        palpite = InOut.leInt(nome + " descubra qual o segredo bravo guerreiro, apenas assim conseguirá prosseguir!\n A senha é um número entre 0 a 100: ");
        if(warrior.qtdVidas -tentativa == 0){
            while (tentativa != warrior.qtdVidas) {       
                if (palpite == senha) {
                    InOut.MsgDeAviso("Passou de Nível!", "Parabéns guerreiro, você acertou a senha");
                    return true;
                } else if (palpite > senha){
                    InOut.MsgDeAviso("Senha Errada!", "Infelizmente você errou, esse número é maior que a senha");
                    InOut.MsgDeAviso("Vidas do Guerreiro", " O Guerreiro possui mais " + (warrior.qtdVidas-tentativa) + " vidas!");
                    palpite = InOut.leInt("Faça seu próximo palpite: ");
                    
                    tentativa++;
                } else if (palpite < senha) {
                    InOut.MsgDeAviso("Senha Errada!", "Infelizmente você errou, esse número é menor que a senha");
                    InOut.MsgDeAviso("Vidas do Guerreiro", " O Guerreiro possui mais " + (warrior.qtdVidas-tentativa) + " vidas!");
                    palpite = InOut.leInt("Faça seu próximo palpite: ");
                    
                    tentativa++;
                }
            }
        }
    return false;
    }    
}  

            
  /*
    
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
        Pedido de Misericórdia do Guerreiro tiver mais que cinco palavras.
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

*/