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
public class CategoriaEleitoral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite sua idade : ");
        int n=sc.nextInt();
        
        if(n<16){
            System.out.println("Nao pode votar");
        } else if((n<=16 && n <=17 )|| n>70){
            System.out.println("Voto opcional");
        } else{
            System.out.println("Voto obrigatorio");
        }
        sc.close();
    }
}
