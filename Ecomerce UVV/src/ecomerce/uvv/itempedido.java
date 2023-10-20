/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecomerce.uvv;


/**
 *
 * @author @Guivizzoni
 */
public class itempedido {
    private int itemPedidoId, quantidade;
    private String item;
    private float PrecoUnitario;
    
    public float calcularPrecoTotal;
    
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getItem(){
        return item;
    }
    
    public void setItem(String item){
         this.item = item;
    }
    
    public int getItemPedidoId() {
        return itemPedidoId;
    }
    public void getItemPedidoId (int itemPedidoId) {
        this.itemPedidoId = itemPedidoId;
    }
    
    public float getCalcularPrecoTotal() {
        return quantidade * PrecoUnitario ;
    }
    
    public void setCalcularPrecoTotal(float calcularPrecoTotal){
         this.calcularPrecoTotal = calcularPrecoTotal * PrecoUnitario;
    } 
    
    public float getPrecoUnitario(){
        return PrecoUnitario;
    }
    
    public void setPrecoUnitario(float PrecoUnitario){
         this.PrecoUnitario = PrecoUnitario;
    }
    
}
