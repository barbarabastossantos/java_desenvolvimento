/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade2;

/**
 *
 * @author ADM
 */
public class Retangulo {
   public  double altura;
   public double base;
    
   public double area(){
      return  base*altura;
   }
   
   public double perimetro(){
       return 2*(base+altura);
   }
   
   public double diagonal(){
       return Math.sqrt(Math.pow(base,2 )+Math.pow(altura, 2));
   }
   
   public String toString(){
       return "Area : "
               +String.format ("%.2f", area())
               + "\n"
               +"Perimetro : "
               +String.format ("%.2f",perimetro())
               + "\n"
               +"Diagonal : "
               +String.format("%.2f", diagonal());
   }
}
