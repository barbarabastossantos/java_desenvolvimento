/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoMelhoradaProduto;
import java.util.Locale;
import java.util.Scanner;
import entidade8.Produto2;
/**
 *
 * @author ADM
 */
public class ProgramaProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Qual nome do produto -> ");
        String nome=sc.nextLine();
        System.out.println("Qual o preco da "+nome + " -> ");
        double preco=sc.nextDouble();
        System.out.println("Qual quantidade de "+ nome+ " no estoque da loja -> ");
        int quantidade=sc.nextInt();
        
        Produto2 produto=new Produto2(nome,preco,quantidade);
        
        System.out.println(" ");
        System.out.println("Dados do produto : ");
        System.out.println(produto);
        System.out.println(" ");
        System.out.println(" Adicionar produtos no estoque -> ");
        quantidade=sc.nextInt();
        produto.addProdutos(quantidade);
        System.out.println(" ");
        System.out.println(" Atualizacoes do produto -> "+ produto);
        System.out.println(" ");
        System.out.println(" Remover produtos do estoque -> ");
        quantidade=sc.nextInt();
        produto.removeProduto(quantidade);
        System.out.println(" ");
        System.out.println(" Atualizoes do produto -> "+ produto);
        
        sc.close();
        
    }
}
