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
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Voce e o adm  s/n");
        String n=sc.next();
        System.out.println("Digite a senha ");
        int senha=sc.nextInt();
        
        if(n.equals("s") || senha==123){
            System.out.println(" acesso permitido");
        }else{
            System.out.println("acesso negado");
        }
        sc.close();
    }
}
