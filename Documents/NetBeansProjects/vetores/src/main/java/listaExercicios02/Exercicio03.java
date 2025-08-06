/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExercicios02;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println(" COMPARAR DOIS VETORES");
        System.out.println(" ");
        System.out.println(" Digite o primeiro vetor com cinco numeros inteiros ");
        
        int[] vect1=new int[5];
         System.out.println(" ");
        for(int i=0; i< vect1.length;i++){
            System.out.println("Digite o "+(i+1)+" numero -> ");
            vect1[i]=sc.nextInt();
        }
        
        int[] vect2=new int[5];
        System.out.println(" ");
        
        System.out.println(" Digite o segundo vetor com cinco numeros inteiros ");
        System.out.println(" ");
        for(int i=0;i<vect2.length;i++){
            System.out.println(" Digite o "+(i+1)+ " numero -> ");
            vect2[i]=sc.nextInt();
            
        }
        System.out.println(" ");
        System.out.println("  Na mesma posicao  entre os dois vetores temos os seguintes numeros  -> ");
         int numeros=0;
        for(int i=0;i<5;i++){
            if(vect1[i] == vect2[i]){
             numeros++; 
                System.out.println(" ");
                System.out.println( vect1[i]+ " na posicao "+i);
            }
        }
        System.out.println(" ");
        System.out.println(" Total de numeros  na mesma posicao temos -> "+ numeros );
       
        sc.close();
    }
}
