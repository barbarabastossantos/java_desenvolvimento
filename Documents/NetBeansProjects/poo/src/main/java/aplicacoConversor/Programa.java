/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacoConversor;
import java.util.Locale;
import java.util.Scanner;
import entidade7.Conversor;
/**
 *
 * @author ADM
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        System.out.print(" Qual preco do dolar -> ");
        double dolar=sc.nextDouble();
        System.out.print(" Quanto de dolar voce quer comprar -> ");
        double moeda=sc.nextDouble();
        System.out.printf(" Voce vai pagar R$ %.2f%n ", Conversor.totalPagar(dolar, moeda));
        
        sc.close();
                
    }
 
}
