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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um numero");
        int n=sc.nextInt();
        
        if(n%7==0){
            System.out.println("Esse numero e multiplo de 7");
        }else{
            System.out.println("Nao e multiplo de 7");
        }
        sc.close();
    }
}
