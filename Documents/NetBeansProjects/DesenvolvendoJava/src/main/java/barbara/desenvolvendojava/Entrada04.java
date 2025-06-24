/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.desenvolvendojava;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ADM
 */
public class Entrada04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner (System.in);
        String x;
        double y;
        int z;             // tanto a declaracao de variavel quanto o next e o print tem que estar na mesma ordem.
        
        x=sc.next();
        y=sc.nextDouble();
        z=sc.nextInt();
      
   
        System.out.println("voce digitou : ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        sc.close();
    }
        
    
}
