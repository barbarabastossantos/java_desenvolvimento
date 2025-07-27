/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package versao3;
import java.util.Locale;
import java.util.Scanner;
import entidade6.Calculadora;
/**
 *
 * @author ADM
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Qual o raio -> ");
        double raio=sc.nextDouble();
        
        System.out.println("PI -> "+Calculadora.PI);
        System.out.printf(" Volume -> %.2f%n ", Calculadora.volume(raio));
        System.out.printf("Circunferencia -> %.2f%n ", Calculadora.circunferencia(raio));
    }
}
