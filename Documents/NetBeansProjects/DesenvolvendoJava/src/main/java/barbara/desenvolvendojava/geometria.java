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
public class geometria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        double A= sc.nextDouble();
        double B= sc.nextDouble();
        double C= sc.nextDouble();
        double pi=314159;
        
        double triangulo= (A*C)/2;
        double circulo= pi * Math.pow(C,2); 
        double trapezio = ((A+B)*C)/2;
        double quadrado= B*B;
        double retangulo= A*B;
        
        System.out.printf(" triangulo = %f \n circulo = %f \n trapezio = %f \n quadrado = %f \n retangulo = %f ", triangulo,circulo,trapezio,quadrado,retangulo);
                
       sc.close();
    }
    
}
