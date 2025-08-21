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
public class Multiplo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Digite um numero ");
          int n=sc.nextInt();
          
          if(n%3==0){
              System.out.println("Esse numero e multiplo de 3");
          }else{
              System.out.println("Esse numero nao e multiplo de 3");
          }
        sc.close();
        
    }
}
