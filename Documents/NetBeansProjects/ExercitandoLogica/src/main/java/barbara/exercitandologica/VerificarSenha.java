/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.exercitandologica;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class VerificarSenha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite a senha -> ");
        int n = sc.nextInt();
        
        if(n==1234){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}
