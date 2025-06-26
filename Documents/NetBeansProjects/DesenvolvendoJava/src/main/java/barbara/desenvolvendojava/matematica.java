/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.desenvolvendojava;


import java.util.Locale;
/**
 *
 * @author ADM
 */
public class matematica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
         double x = 3.0;
         double y = 4.0;
         double z = -5.0;
         double A,B,C;
         
         //sqrt -> raiz quadrada
         //pow -> potencia 
         
         A=Math.sqrt(x);
         B=Math.sqrt(y);
         C=Math.sqrt(25.0);
         System.out.printf("Raiz quadrada de %.1f = %.2f \n " ,x, A);
          System.out.println("Raiz quadrada de " + y + " = " + B );
           System.out.println("\nRaiz quadrada de 25 = " + C);
           
           
         A= Math.pow(x, y);
         B= Math.pow(x, 2.0);
         C=Math.pow(5.0, 2.0);
         
         System.out.println("\n"+x + " elevado " + y+ " = " + A);
         System.out.println("\n"+ x + " elevado  ao quadrado  = " + B);
         System.out.println(" \n 5  elevado ao quadrado =  " + C);
    }
    
}
