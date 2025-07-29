/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade10;

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
    
    public Produto(String nome,double preco){
        this.nome=nome;
        this.preco=preco;
    }
    
    public Produto(String nome, double preco, int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public double valorTotal(){
        return preco*quantidade;
    }
    
    public void addProduto(int quantidade){
        this.quantidade+=quantidade;
    }
    
    public void removeProduto(int quantidade){
        this.quantidade-=quantidade;
    }
    
    public String toString(){
        return" Nome do produto -> "
                + nome
                +" \n Preco do produto -> R$  "
                + String.format("%.2f%n ", preco)
                +"\n  Unidades  desse produto -> "
                + quantidade
                +" Valor do Estoque -> R$ "
                + String.format("%.2f%n ", valorTotal());
    }
}
