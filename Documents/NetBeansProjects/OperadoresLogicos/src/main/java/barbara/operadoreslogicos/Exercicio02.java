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
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite sua idade");
        int idade=sc.nextInt();
        
        if(idade >=18 && idade <=25){
            System.out.println(" Pode entrar");
        }else{
            System.out.println("Nao pode entrar");
        }
        sc.close();
    }
}
