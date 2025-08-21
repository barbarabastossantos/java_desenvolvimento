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
public class CategoriaNadador {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite sua idade ");
        int n=sc.nextInt();
        
        if(n<=10){
            System.out.println("infantil");
        }else if( n <=17){
            System.out.println("juvenil");
        }else if( n<=29){
            System.out.println("Adulto");
        }else{
            System.out.println("master");
        }
        
        
        
        
        sc.close();
        
    }
}   
