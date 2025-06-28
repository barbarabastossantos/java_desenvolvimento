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
public class raio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        // ler raio do circulo
        
        double raio = sc.nextDouble();
        
        double pi= 3.14159;
        
        //double area= pi * raio**2; so funciona em python em java e Math.pow(x,c);
        
        double area= pi* Math.pow(raio, 2);
        
        System.out.printf(" A area do circulo e : %.4f ", area);
        
        sc.close();
        
    }
    
}
