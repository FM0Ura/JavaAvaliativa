
package iptu;


import java.util.HashMap;
import java.util.Map;


public class municipio {
    Map<String, Imovel> mi = new HashMap(); // CRIA UM MAPA QUE ARMAZENA UMA MATRICULA (STRING) E UM IMOVEL (OBJETO)
    String nome;

    public municipio(String nome) {
        this.nome = nome;
    }
    
    
    public void exibirImovel(){     // EXIBE O PROPRIETARIO, MESES DE ATRASO, ALUGUEL E MULTA
        String key = InOut.leString("Digite a matricula do imovel desejado: ");
        mi.get(key).calcularMulta();
        InOut.MsgDeAviso("Imovel", "Nome do proprietario: " + mi.get(key).proprietario + "\nValor do aluguel: " + mi.get(key).imposto + "\nMeses em atraso: " + mi.get(key).mesesAtraso + "\nMulta atual: " + mi.get(key).multa);
    }
    public void cadastrarImovel(){  // CADASTRA UM NOVO IMOVEL NO MUNICIPIO
        InOut.MsgDeAviso("Novo imovel", "Criando um novo imovel");
        String nproprietario = InOut.leString("Digite o nome do proprietario: ");
        int meses = InOut.leInt("Digite quantos meses esta atrasado: ");
        float impostoi = InOut.leFloat("Digite o valor do imposto: ");
        String key = InOut.leString("Digite a matricula do imovel: ");
        
        Imovel aux = new Imovel(nproprietario, impostoi, meses);
        
        mi.put(key, aux);
    }
        public double calcularMultaTotal() { // TODAS AS MULTAS SOMADAS
            double multaTotal = 0.0; 

            for (Imovel imovel : mi.values()) {
                multaTotal += imovel.calcularMulta();
            }

            return multaTotal;
        }
    
        public void listarImoveis() {
            InOut.MsgDeAviso("Lista de imoveis", "Os imoveis do municipio sao: " + mi.keySet());
        }
    
    public static void main(String[] args) {
        
        municipio m1 = new municipio("guarapari");
        m1.cadastrarImovel();
        m1.cadastrarImovel();
        m1.exibirImovel();
        m1.exibirImovel();
        InOut.MsgDeAviso("Multa total", "A multa total do municipio eh: " + m1.calcularMultaTotal());
       
        m1.listarImoveis();
    }
    
}
