/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.exercitandologica;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class AprovadoReprovado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
       
        
        System.out.println("Digite sua nota : ");
         double n=sc.nextDouble();
         
         if(n>=7){
             System.out.println("Aprovado");
         }else{
             System.out.println("Reprovado");
         }
         
         sc.close();
    }
}
