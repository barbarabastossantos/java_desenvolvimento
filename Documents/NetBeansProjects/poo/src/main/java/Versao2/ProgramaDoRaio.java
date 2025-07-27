/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Versao2; // resolvendo o problema com membros de instancia
import java.util.Locale;
import java.util.Scanner;
import entidade5.Raio;
/**
 *
 * @author ADM
 */
public class ProgramaDoRaio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        Raio raio =new Raio();
        
        System.out.println(" qual o raio -> ");
        double raius=sc.nextDouble();
        
       double  c=raio.circunferencia(raius);
       double v=raio.volume(raius);
       
        System.out.println("PI -> "+ raio.PI);
        System.out.printf("Circunferencia -> %.2f%n ",c);
        System.out.printf("Volume -> %.2f%n ",v);
        
        sc.close();
    }
}
