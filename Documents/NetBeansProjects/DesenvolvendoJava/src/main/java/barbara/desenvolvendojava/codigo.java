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
public class codigo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
      
        
        int codigoprimeiro= sc.nextInt();
        int pecasprimeiro= sc.nextInt();
        double valorprimeiro= sc.nextDouble();
        int codigosegundo= sc.nextInt();
        int pecassegundo= sc.nextInt();
        double valorsegundo= sc.nextDouble();
        
        double pagar= (pecasprimeiro*valorprimeiro) + (pecassegundo*valorsegundo);
        
        System.out.printf(" Valor a pagar = U$ %.2f ", pagar);
        
        sc.close();
    }
    
}
