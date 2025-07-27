/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Versao1; //primeira versao do problema com metodos na propria classe do programa
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ADM
 */
public class Pragrama1 {
    public static final double PI=3.14; // constante Pi
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Qual o raio -> ");
        double radio=sc.nextDouble();
        
        double c= circunferencia(radio);
        double v=volume(radio);
        
        System.out.printf("Circunferencia -> %.2f%n ",c);
        System.out.printf("Volume -> %.2f%n ", v);
        System.out.println(" PI -> "+PI);
        
        sc.close();
    }
    
    public static double circunferencia(double radio){
        return 2.0*PI*radio;
    }
    
    public static double volume(double radio){
        return 4.0*PI* Math.pow(radio, 3)/3;
    }
    
}
