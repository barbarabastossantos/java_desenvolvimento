/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacoAluguel;

import entidade2.Aluguel;
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
      Aluguel[] vect=new Aluguel[10];// vai criar meu vetor com 10 posicoes ainda nulas que serao meus quartos vagos 
        System.out.println(" Quantos quartos serao alugados ?");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            System.out.println(" ");
            System.out.println("Aluguel # "+i+":");
            System.out.println("Nome : ");
            sc.nextLine();
            String nome=sc.nextLine();
            System.out.println(" Email : ");
            String email=sc.next();
            System.out.println("Quarto : ");
            int quartoNumero=sc.nextInt();
            vect[quartoNumero]=new Aluguel(nome,email);
        /*fiz meu vetor receber a posicao o 
            numero do quarto digitado e instanciei minha 
             classe Aluguel com
              nome e email*/
         
        }
        
         System.out.println(" Relatorio dos quartos alugados : "); 
        System.out.println(" ");
        for(int i =0;i<10;i++){
            if(vect[i]!= null){
            System.out.println(i+":" +vect[i]);
            }
        }
        sc.close();
    }
}
