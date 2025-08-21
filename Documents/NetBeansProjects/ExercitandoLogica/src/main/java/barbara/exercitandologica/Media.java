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
public class Media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite suas duas notas ");
        double n1=sc.nextDouble();
        double n2= sc.nextDouble();
        
        double media =(n1+n2)/2;
        
        if(media>=7){
            System.out.println("Aprovado");
        }else if(media >=5){
            System.out.println("Recuperacao");
        }else{
            System.out.println("Reprovado");   
        }
         System.out.println(" media Final -> "+ media);
        sc.close();
    }
}
