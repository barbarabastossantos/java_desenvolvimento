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
public class Exercicio05 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
      
        System.out.println("quantas pessoas vai ter a idade digitada ? ");
       int n=sc.nextInt();
       
       int[] vect=new int[n];
       
       for(int i=0;i<vect.length;i++){
           System.out.println(" digite a idade da "+(i+1)+ " pessoa : ");
            vect[i]=sc.nextInt();
       }
       int maiorIdade= vect[0];
       
       for(int i=1;i<vect.length;i++){ // comeca com 1 pq maiorIdade ja tem a posicao 0
           if(vect[i]>maiorIdade){
             maiorIdade=vect[i]; 
           }
       }
        System.out.println("a maior idade e "+ maiorIdade);
       sc.close();
    }
}

