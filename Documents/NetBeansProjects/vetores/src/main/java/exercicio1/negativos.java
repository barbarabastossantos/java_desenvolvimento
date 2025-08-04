/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Digite um numero no maximo ate 10 -> ");
        int n=sc.nextInt();
         int[]vect=new int[n];
         
        
            sc.nextLine();
            for(int i=0;i<vect.length;i++){
                System.out.println("Digite um numero : ");
                vect[i]= sc.nextInt();
            }
             System.out.println(" numeros negativos : ");
         
             for(int i=0;i<vect.length;i++){
                 if(vect[i]<0){
                     System.out.println(vect[i]);
                 }
             }
        sc.close();
    }
}
