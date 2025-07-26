/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;
import java.util.Locale;
import java.util.Scanner;
import entidadeo1.Produto;
/**
 *
 * @author ADM
 */
public class Programa {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc=new Scanner(System.in);
      
      Produto produto=new Produto();
        System.out.println("Entrada de produtos ");
        System.out.print(" Nome : ");
        produto.nome=sc.nextLine();
        System.out.println(" Preco : ");
        produto.preco=sc.nextDouble();
        System.out.println(" Quantidade no Estoque : ");
        produto.quantidade=sc.nextInt();
        System.out.println(" ");
        System.out.println("Dados do Produto : " + produto);
        System.out.println(" ");
        
        System.out.println(" Entrar com o numero de produtos adicionados no estoque : ");
        int quantidade= sc.nextInt();
        produto.addProdutos(quantidade);
        
        System.out.println(" ");
        System.out.println(" Atualizacao dos dados  : "+ produto );
        
        System.out.println(" ");
        System.out.println(" Entrar com o numero de produtos removidos no estoque : ");
        quantidade=sc.nextInt();
        produto.removeProdutos(quantidade);
        
        System.out.println(" ");
        System.out.println(" Atualizacao os dados : "+ produto);
        
        sc.close();
    }
}
