/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade9;

/**
 *
 * @author ADM
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(){
        
    }
    public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }
    public Produto(String nome, double preco,int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    public double getPreco(){
        return preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }
    
    public double totalEstoque(){
        return preco*quantidade; 
    }
    
    public void addEstoque(int quantidade){
        this.quantidade+=quantidade;
    }
    
    public void removeEstoque(int quantidade){
        this.quantidade-=quantidade;
    }
    
    public String toString(){
        return " Nome do produto -> "
                + nome
                +" \n Preco do produto -> R$  "
                + String.format("%.2f%n ", preco)
                +"\n  Unidades  desse produto -> "
                + quantidade
                +" Valor do Estoque -> R$ "
                + String.format("%.2f%n ", totalEstoque());
    }
}
