/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade6;

/**
 *
 * @author ADM
 */
public class Calculadora {
   public static final double PI=3.14;
   
   public static double circunferencia(double raio){
      return 2.00*PI*raio; 
   }
   
   public static double volume(double raio){
       return 4.00*PI* Math.pow(raio, 3)/3;
   }
}
