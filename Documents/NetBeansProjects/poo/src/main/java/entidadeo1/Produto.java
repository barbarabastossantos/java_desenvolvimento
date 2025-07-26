/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidadeo1;

/**
 *
 * @author ADM
 */
public class Produto {
    public  String nome; // nome,preco,quantodade sao atributos da classe produto
    public double preco; 
    public int quantidade;
    
    public double totalValorEstoque (){ // o metodo totalValorEstoque e vazio os parametros pois n aclasse ja tem oque ele precisa pra fazer a operacao
        return preco*quantidade;
    }
    
    public void addProdutos(int quantidade){
        this.quantidade+=quantidade; // esse this. e pra diferenciar o quantidade da classe da quantidade do parametro
    }
    
    public void removeProdutos(int quantidade){
        this.quantidade-=quantidade;
    }
    
    public String toString(){
        return " nome do produto : "
                +nome
                + " , preco :  R$ "
                + String.format ("%.2f",preco)
                + " , quantidade do produto : "
                + quantidade
                + " unidade "
                + " total valor de estoque do produto: R$ "
                + String.format ("%.2f",totalValorEstoque());
    }
}
