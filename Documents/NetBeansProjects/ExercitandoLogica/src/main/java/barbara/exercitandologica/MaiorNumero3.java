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
public class MaiorNumero3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite tres numeros");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        
        if(n1>n2){
            System.out.println(n1+ "  e maior que "+ n2+ " e "+ n3);
        }else if(n2>n3){
            System.out.println(n2+ "  e maior que "+ n1+ " e "+ n3);
        }else{
            System.out.println(n3+ "  e maior que "+ n1+ " e "+ n2);
        }
        
        sc.close();
    }
}
