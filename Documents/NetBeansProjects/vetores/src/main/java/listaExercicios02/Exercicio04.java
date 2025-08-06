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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
    int[] vect1 =new int[5];
    int[] vect2=new int[5];
        System.out.println("  Digite cinco numeros inteiros ");
        
        for(int i=0;i<vect1.length;i++){
            System.out.println(" numero "+(i+1)+ " -> ");
            vect1[i]=sc.nextInt();
        }
        
         System.out.println("  Digite cinco numeros inteiros ");
        
        for(int i=0;i<vect2.length;i++){
            System.out.println(" numero "+(i+1)+ " -> ");
            vect2[i]=sc.nextInt();
        }
        
        System.out.println(" numeros na mesma posicao e valor sao ");
        int numeros=0;
        for(int i=0;i<vect1.length;i++){
            if(vect1[i] == vect2[i]){
                numeros++;
                System.out.println(" numero "+ vect1[i]+ " na posicao "+i);
            }
        }
        System.out.println(" Foram "+ numeros +" numeros  com mesmo valor e posicao ");
        sc.close();
    }
  

}
