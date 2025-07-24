/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;

import entidades.Triangulo;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class programa2 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Triangulo x,y;
        x=new Triangulo();
        y= new Triangulo();
        
        System.out.println(" digite as medidas do triangulo x : ");
         x.a=sc.nextDouble();
         x.b=sc.nextDouble();
         x.c=sc.nextDouble();
         System.out.println(" Digite as medidas do triangulo y : ");
          y.a=sc.nextDouble();
          y.b=sc.nextDouble();
          y.c=sc.nextDouble();
         
        
         double areaX= x.area();
         
         
         double areaY=y.area();
         
         
         if(areaX > areaY){
             System.out.printf(" area x :  %.2f%n  ", areaX);
             System.out.printf(" area y :  %.2f%n  ", areaY);
             System.out.println("triangulo x tem area maior ");
         } else{
             System.out.printf("area x :  %.2f%n  ", areaX);
             System.out.printf("area y : %.2f%n  ", areaY);
             System.out.println("triangulo y tem area maior");
         }
         sc.close();
    }
}


