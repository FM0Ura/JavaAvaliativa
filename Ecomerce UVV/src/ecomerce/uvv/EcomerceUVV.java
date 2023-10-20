/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecomerce.uvv;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author @Guivizzoni
 */
public class EcomerceUVV {
    private int lojaid;
    private String nomeFantasia, cnpj;
    private double valorDeMercado;

    public int getLojaid() {
        return lojaid;
    }
    public void setLojaid (int lojaid) {
        this.lojaid = lojaid;
    }
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia (String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj (String cnpj) {
        this.cnpj = cnpj;
    }
    
    public double getValorDeMercado() {
        return valorDeMercado;
    }
    public void setValordemercado (double valorDeMercado) {
        this.valorDeMercado = valorDeMercado;
    }
        
public static void main(String[] args) {    
    
   Date dataEmissao = new Date();
   // Criando uma lista para os pedidos
    List<pedido> listaPedidos = new ArrayList<>();

        // Coletando informações da loja
        String nomeFantasia = InOut.leString("Digite o nome da loja: ");
        String cnpj = InOut.leString("Digite o CNPJ: ");
        int lojaid = InOut.leInt("Digite o id da loja: ");
        double valorDeMercado = InOut.leDouble("Digite o valor de mercado do produto: ");
        int quantidade = InOut.leInt("Digite a quantidade de produtos: ");
        String nome = InOut.leString("Digite o nome do funcionário: ");
        String matricula = InOut.leString("Digite a matrícula do funcionário: ");
        float salario = InOut.leFloat("Digite o salário do funcionário: ");
        
        // Adicionando pedidos à lista
        pedido p1 = new pedido(1, 100.0f);
        pedido p2 = new pedido(2, 150.0f);
        pedido p3 = new pedido(3, 200.0f);

        listaPedidos.add(p1);
        listaPedidos.add(p2);
        listaPedidos.add(p3);

        // Acessando os pedidos na lista
        for (pedido pedido : listaPedidos) {
            InOut.MsgDeInformacao("Nome da loja", (nomeFantasia));
            InOut.MsgDeInformacao("CNPJ da loja", (cnpj));
            //InOut.MsgDeInformacao("ID da loja", (lojaid));
            //InOut.MsgDeInformacao("Valor de mercado", (valorDeMercado));
            //InOut.MsgDeInformacao("Quantidade de produtos", (quantidade));
            InOut.MsgDeInformacao("Nome do funcionario", (nome));
            InOut.MsgDeInformacao("Matricula do funcionario", (matricula));
            //InOut.MsgDeInformacao("Salario do funcionario funcionario", (salario));
            

           //InOut.leDouble((valorDeMercado));
                 //InOut.leInt((lojaid));
                 //InOut.leInt((quantidade));
                 //InOut.leFloat((salario));
                 
                 
                 //Comentando a lista
            System.out.println("Número do Pedido: " + pedido.getPedidoId());
            System.out.println("Id da loja: " + pedido.ValorTotalCalculado());
            System.out.println("Nome da loja: " + (nomeFantasia));
            System.out.println("CNPJ da loja: " + (cnpj));
            System.out.println("ID da loja: " + (lojaid));
            System.out.println("Valor de mercado: " + (valorDeMercado));
            System.out.println("Quantidade de produtos: " + (quantidade));
            System.out.println("Nome do funcionario: " + (nome));
            System.out.println("Matricula do funcionario: " + (matricula));
            System.out.println("Salario do funcionario funcionario: R$ " + (salario));
            //System.out.println("Valor total dos produtos: " + (valorTotalCalculado));
            System.out.println("Data da emissão do produto: " + dataEmissao);
        }
        
        
        
        //funcionario f = new funcionario();
       //f.setNome();
       // f.setMatricula();
        //f.setSalario(2500);
        
            
    //pedido p = new pedido();
    //p.PedidoId = 1;
    //p.dataEmissao = Date;
    }


}

    
    

