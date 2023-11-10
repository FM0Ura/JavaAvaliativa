package espiritoguerreiro;

/** @author FM0ura */

public class EspiritoGuerreiro {
        public static void main(String[] args) {
                Oraculo master = new Oraculo();
                String continuar;
                master.setNome(); // NOME DO ORÁCULO

                master.prologoIntroducao(); // PRÓLOGO DE INTRODUÇÃO

                // LOOP PARA CASO O JOGADOR QUEIRA JOGAR NOVAMENTE
                do {
                        int vidasRestantes = master.loadLevel1(); // LEVEL 1

                        if (vidasRestantes == 0) {
                                master.prologoPerdedor();
                                break;
                        } // GAME OVER -- LEVEL 1

                        // LEVEL 2
                        vidasRestantes = master.loadLevel2();

                        if (vidasRestantes == 0) {
                                master.prologoPerdedor();
                                break;
                        } // GAME OVER -- LEVEL 2

                        // QUER CONTINUAR A PARTIDA?
                        continuar = InOut.leString("Deseja jogar outra partida? (Digite 'SIM' para continuar ou 'NÃO' para encerrar o jogo)");
                        if (!continuar.equalsIgnoreCase("SIM")) {
                                break; // QUIT
                        }

                } while (true);
        }
}
