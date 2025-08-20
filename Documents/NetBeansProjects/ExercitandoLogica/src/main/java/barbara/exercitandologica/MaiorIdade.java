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
public class MaiorIdade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Qual sua idade :");
        int n=sc.nextInt();
        
        if(n>=18){
            System.out.println("Parabens voce ja e maior de idade");
        }else{
            System.out.println("Infelizmente  voce ainda nao e maior d idade");
        }
        sc.close();
    }
}
