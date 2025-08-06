/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExercicios03;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ContarNumerosPares {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int[] vect=new int[10];
        System.out.println(" Digite dez numeros inteiros ");
        for(int i =0; i< vect.length;i++){
            System.out.println(" numero "+(i+1)+"-> ");
            vect[i]=sc.nextInt();
        }
        
        int par=0;
        System.out.println("Sao pares");
        for(int i =0; i < vect.length;i++){
            if(vect[i]%2==0){
                par++;
                System.out.println(vect[i]);
                        
            }
        }
        
        System.out.println(" total de "+par+" numeros pares");
        sc.close();
    }
}
