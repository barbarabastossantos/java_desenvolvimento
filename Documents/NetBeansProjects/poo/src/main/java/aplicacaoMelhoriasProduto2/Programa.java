/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoMelhoriasProduto2;
import java.util.Locale;
import java.util.Scanner;
import entidade9.Produto;
/**
 *
 * @author ADM
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Qual nome do produto -> ");
        String nome=sc.nextLine();
        System.out.println("Qual o preco da "+ nome + " -> ");
        double preco=sc.nextDouble();
      
        
        Produto produto=new Produto(nome ,preco);
        
        System.out.println(" Atualizacao do Produto : "+ produto);
        System.out.println(" Qual a quantidade de "+ nome + " na loja -> ");
        int quantidade=sc.nextInt();
   
        produto=new Produto(nome,preco,quantidade);
        System.out.println(" Atualizacao do Produto : "+ produto);
        
        System.out.println(" Quantidades para ser adicionada -> ");
        quantidade=sc.nextInt();
        produto.addEstoque(quantidade);
        
        System.out.println(" Atualizacao do produto  ->  "+ produto);
        
        System.out.println(" Quantidades a serem removidas -> ");
        quantidade=sc.nextInt();
        produto.removeEstoque(quantidade);
        
        System.out.println("Atualizacao do produto -> "+ produto);
       
        sc.close();
                
    }
}
