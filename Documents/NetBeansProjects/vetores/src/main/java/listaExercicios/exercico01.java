/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExercicios;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class exercico01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int[] vect=new int[5];
          System.out.println(" ");
          System.out.println("Digite cinco numeros inteiros ");
           System.out.println(" ");
          for(int i=0; i<5;i++){
              System.out.println("Numero "+(i+1)+" : ");
              int n=sc.nextInt();
              vect[i]=n;
              
          }
         System.out.println(" ");
         System.out.println(" Posicao ocupada por cada numero digitado : ");
         System.out.println(" ");
         for(int i=0; i<5;i++){
             System.out.println("Na posicao "+i+ " -> " + vect[i]);
         }
          
          sc.close();
    }
}
