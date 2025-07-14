/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_repeticao;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite a senha : ");
        int senha=sc.nextInt();
        
        while(senha!= 2002){
             System.out.println("Senha invalida!\n Digite nova senha : ");   
             senha=sc.nextInt();
            }
            System.out.println("Senha valida");   
        
        
        
        
        
        
        
        sc.close();
    }
}
