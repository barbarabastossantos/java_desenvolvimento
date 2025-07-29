/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoMelhoriasProduto3;
import java.util.Locale;
import java.util.Scanner;
import entidade10.Produto;
/**
 *
 * @author ADM
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Qual nome do produto -> ");
        String nome=sc.nextLine();
        System.out.println("Qual preco da "+nome+" -> ");
        double preco=sc.nextDouble();
        
        Produto produto=new Produto(nome,preco);
        
        System.out.println(produto);
        System.out.println(" ");
        
        System.out.println(" Qual quantidade de "+ nome+ " na loja -> ");
        int quantidade=sc.nextInt();
        
        produto=new Produto(nome,preco,quantidade);
        
        System.out.println(" ");
        System.out.println(produto);
        
        produto.setNome("Computador");
        produto.setPreco(3500.00);
        
        System.out.println(" Atualizacao do produto ->  nome : "+ produto.getNome()+ " , preco : "+produto.getPreco());
        
        System.out.println(" Quantos produtos adicionar ao estoque -> ");
        quantidade=sc.nextInt();
        produto.addProduto(quantidade);
        
        System.out.println(" Atualizacao do produto -> "+ produto);
        
        System.out.println(" Quantos produtos remover do estoque -> ");
        quantidade=sc.nextInt();
        produto.removeProduto(quantidade);
        
        System.out.println("Atualizacao do produto "+ produto);
        
        
        sc.close();
    }
}
