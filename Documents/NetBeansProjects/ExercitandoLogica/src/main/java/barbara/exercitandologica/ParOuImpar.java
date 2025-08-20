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
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int n=sc.nextInt();
        
        if(n%2==0){
            System.out.println("Esse numero e par");
        } else{
            System.out.println("Esse numero e impar");
        }
        
        sc.close();
    }
}
