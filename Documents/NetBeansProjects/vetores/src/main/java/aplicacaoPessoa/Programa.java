/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoPessoa;

import entidade1.Pessoa;
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
        
        System.out.println("Quantas pessoas serao digitadas : ");
        int n=sc.nextInt();
        
        Pessoa[] vect= new Pessoa[n];
        
        for(int i=0; i<vect.length;i++){
            sc.nextLine();
            System.out.println("Dados da "+ (i+1)+"a pessoa : ");
            System.out.println("Nome: ");
            String nome=sc.nextLine();
            System.out.println(" Idade : ");
            int idade=sc.nextInt();
            System.out.println(" Altura: ");
            double altura=sc.nextDouble();
            
            vect[i]=new Pessoa(nome,idade,altura);
        }
         double soma=0.0;
        for(int i=0;i<vect.length;i++){
         soma+=vect[i].getAltura();
        }
        
        double media= soma/vect.length;
        
        System.out.printf(" media de altura: %.2f%n ",media );
    
           System.out.println(" Os menores de 16 anos  sao : ");
           
            
            int idadeMenores=0;
           
           for(int i=0; i<vect.length;i++){
              if(vect[i].getIdade() <16){
                 idadeMenores++;
                  System.out.println(vect[i].getNome());
                  System.out.println(vect[i].getIdade());
              } 
              
           }
           
           int porcentagem =idadeMenores*100/vect.length;
           System.out.println("a porcentagem de menores de 16 anos e de " + porcentagem+ " %");
     
        
        sc.close();
    }
}

     
  