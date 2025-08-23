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
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite um numero ");
        int n=sc.nextInt();
        
        if(n>=0 && n<=100){
          
            System.out.println("Esta dentro das condicoes poie ele e positivo e menor que  100");
           
        }else  if(n<0){
            System.out.println("Nao esta dentro das condicoes pois e um numero negativo");
        }else{
                System.out.println("Nao esta dentro das condicoespois e um numero maior que 100");
            }
          
        
        
        
        
        sc.close();
    }

}