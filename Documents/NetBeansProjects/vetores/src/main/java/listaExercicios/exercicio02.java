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
public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] vect=new int[5];
        
        System.out.println(" ");
        System.out.println("Digite 5 numeros inteiros : ");
        
        System.out.println(" ");
        for(int i=0;i<5;i++){
            System.out.println(" Numero "+(i+1)+" : ");
            vect[i]=sc.nextInt();
        }
        
        System.out.println(" ");
        System.out.println(" Numeros na posicao decrescente : ");
        System.out.println(" ");
        
        for(int i=4;i>=0;i--){
            System.out.println(" Na posicao " + i +" -> "+vect[i]);
            
        }
        
        sc.close();
    }
 
}
