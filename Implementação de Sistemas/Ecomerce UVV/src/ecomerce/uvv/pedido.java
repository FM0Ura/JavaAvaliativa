/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecomerce.uvv;

import java.util.Date;
import java.util.List;

/**
 *
 * @author @Guivizzoni
 */
public class pedido {
   int pedidoId;
   private Date dataEmissao;
   private float valorTotalCalculado;

   List<itempedido> lip;
   itempedido ip;
  
   public pedido(int pedidoId, float ValorTotalCalculado) {
        this.pedidoId = pedidoId;
        this.valorTotalCalculado = ValorTotalCalculado * pedidoId;
   }
 
    public float ValorTotalCalculado() {
       return valorTotalCalculado;
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
       
}
