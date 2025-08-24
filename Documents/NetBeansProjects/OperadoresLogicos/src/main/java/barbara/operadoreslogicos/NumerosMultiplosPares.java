/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.operadoreslogicos;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class NumerosMultiplosPares {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Digite um numero ->");
        int n=sc.nextInt();
       
        //primeira verificacao par ou impar
        
        if(n%2==0){
            System.out.println("Esse numero e par");
        }else{
            System.out.println("Esse numero e impar");
        }
        
        //segunda verificacao multiplo de 3 e 5
        
        if(n%3==0 && n%5==0){
            System.out.println(" E tambem multiplo de 3 e 5");
        }else{
            System.out.println("Mas nao e multiplo de 3 e 5");
        }
 
        sc.close();
    }
}
