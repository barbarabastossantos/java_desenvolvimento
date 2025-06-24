/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.desenvolvendojava;


import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author ADM
 */
public class Entrada03 {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
         Double x;
         x= sc.nextDouble();
        
         System.out.println("Voce digitou : " + x);
         
         sc.close();
    }
    
}
