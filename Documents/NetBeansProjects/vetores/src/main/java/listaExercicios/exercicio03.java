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
public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] vect=new int[6];
        
        System.out.println(" ");
        System.out.println("Digite  seis numeros inteiros : ");
        System.out.println(" ");
        
        for(int i=0;i<6;i++){
            System.out.println("Numero "+ (i+1)+ " : ");
            vect[i]=sc.nextInt();
        }
         System.out.println(" ");
         System.out.println(" Esses sao os numeros que voce  digitou que sao  maiores que 10 : ");
         
         System.out.println(" ");
         
         for(int i=0; i<6;i++){
             if(vect[i]>10){
                 System.out.println(" Na posicao "+i+ " -> "+ vect[i]);
             }
         }
        
    }
 
}
