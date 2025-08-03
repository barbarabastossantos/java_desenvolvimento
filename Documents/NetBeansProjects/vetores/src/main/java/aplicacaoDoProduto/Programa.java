/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoDoProduto;

import entidade.Produto;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        int n= sc.nextInt();
        
        Produto[] vect=new Produto[n];
        
        for(int i=0;i<vect.length;i++){
            sc.nextLine();
            String nome=sc.nextLine();
            double preco=sc.nextDouble();
            vect[i]=new Produto(nome,preco); // esse for vai fazer meu vetor apontar para nome e preco essa e a diferenca entre tipo valor e tipo referencia
        }
         double soma=0.0;
         
         for(int i=0;i<vect.length;i++){
             soma+=vect[i].getPreco();// usamos o getPreco para acessar o preco do vetor
         }
         
         double media= soma/vect.length;
         
         
         System.out.printf("Media : %.2f%n ",media);
         
         sc.close();
    }
}
