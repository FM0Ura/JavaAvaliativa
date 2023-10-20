/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecomerce.uvv;

import java.util.Date;

/**
 *
 * @author @Guivizzoni
 */
public class pedido {
   int pedidoId;
   private Date dataEmissao;
   private float valorTotalCalculado;

   public pedido(int pedidoId, float ValorTotalCalculado) {
        this.pedidoId = pedidoId;
        this.valorTotalCalculado = ValorTotalCalculado;
   }
   // Date dataEmissao = new Date();
    
    public float ValorTotalCalculado() {
       return valorTotalCalculado * pedidoId ;
    }
    
    public void setValorTotalCalculado(float valorTotalCalculado){
         this.valorTotalCalculado = valorTotalCalculado;
    }
    
    public Date dataEmissao() {
        return dataEmissao;
    }
    
    public void setdataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
     
    public int getPedidoId(){
        return pedidoId;
    }
    
    public void setPedidoId(int pedidoId){
         this.pedidoId = pedidoId;
    }
    
     public static void main(String[] args) {
     
         itempedido ip = new itempedido();
         ip.getItem();
         ip.calcularPrecoTotal();
     }
     
     
}
