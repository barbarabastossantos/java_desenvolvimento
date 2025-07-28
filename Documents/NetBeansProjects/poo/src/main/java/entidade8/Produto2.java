/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade8;

/**
 *
 * @author ADM
 */
public class Produto2 {
    public String nome;
    public double preco;
    public int quantidade;
    
    public Produto2(String nome, double preco,int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }
    
    public double totalEstoque(){
        return quantidade*preco;
    }
    
    public void addProdutos(int quantidade){
        this.quantidade+=quantidade;
    }
    
    public void removeProduto(int quantidade){
        this.quantidade-=quantidade;
    }
    
    public String toString(){
     return 
             "nome do produto -> "
             + nome 
             +"  \n"
             +"preco do produto -> "
             + String.format("R$  %.2f%n ", preco)
             +"\n"
             +"quantidade no estoque -> "
             + String.format(" %.2f%n ", totalEstoque())
             +"\n"
             +" com "
             + quantidade
             + " unidades ";
    }
    
}
