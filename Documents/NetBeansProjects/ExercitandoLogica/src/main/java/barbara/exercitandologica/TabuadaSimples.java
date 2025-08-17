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
public class TabuadaSimples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("  ");
        System.out.println("Tabuada");
        System.out.println(" ");
        System.out.println(" Digite o numero desejado : ");
        int n=sc.nextInt();
        System.out.println("\n===========================\n");
        System.out.println("Tabuada  de multiplicacao do "+ n);
        System.out.println(" ");
        for(int i=1;i<=10;i++){
            int result= n*i;
            
            System.out.println(n+ " x "+ i+ " = "+ result);
        }
        
        System.out.println(" \n ====================== \n");
        System.out.println(" Tabuada de divisao do "+n);
        System.out.println(" ");
        for(int i=1;i<=10;i++){
            double result=(double)n/i;
            
           System.out.printf("%d / %d = %.2f%n", n, i, result); // %d -> inteiro
        }
        
          System.out.println(" \n ====================== \n");
        System.out.println(" Tabuada de adicao do " + n);
        System.out.println(" ");
        for(int i=1;i<=10;i++){
            int result=n+i;
            
             System.out.println(n+ " + "+ i+ " = "+ result);
        }
        
          System.out.println(" \n ====================== \n");
        System.out.println(" Tabuada de subtracao do "+ n);
        System.out.println(" ");
        for(int i=1;i<=10;i++){
            int result=n-i;
            
             System.out.println(n+ " - "+ i+ " = "+ result);
        }
        
        sc.close();
    }
}
