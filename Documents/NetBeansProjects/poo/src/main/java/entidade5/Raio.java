/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade5;

/**
 *
 * @author ADM
 */
public class Raio {

   public final double PI=3.14;
   
   public double circunferencia(double raius){
      return 2.00*PI*raius;
   }
   
   public double volume(double raius){
       return 4.00*PI* Math.pow(raius, 3)/3;
   }
    
}
