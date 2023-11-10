/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecomerce.uvv;

/**
 *
 * @author @Guivizzoni
 */
public class funcionario {
    private String nome, matricula;
    private float salario;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
         this.nome = nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
         this.matricula = matricula;
    }
    
    public float getSalario(){
        return salario;
    }
    public void setSalario (float salario) {
        this.salario = salario;
    }
}
