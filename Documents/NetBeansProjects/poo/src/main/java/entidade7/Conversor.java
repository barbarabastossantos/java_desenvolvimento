/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade7;



/**
 *
 * @author ADM
 */
public class Conversor {
    
   public static double pagar(double dolar,double moeda){
      return dolar*moeda;
   }
  
   public  static double imposto(double dolar,double moeda){
  return pagar( dolar, moeda)*6/100;
   }
   
   public static double totalPagar(double dolar,double moeda){
       return pagar(dolar,moeda)+imposto(dolar,moeda);
   }
}
