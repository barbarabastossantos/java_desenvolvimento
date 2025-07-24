/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ADM
 */
public class programa1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        System.out.println(" digite as medidas do triangulo x : ");
        double xa=sc.nextDouble();
        double xb=sc.nextDouble();
        double xc=sc.nextDouble();
         System.out.println(" Digite as medidas do triangulo y : ");
         double ya=sc.nextDouble();
         double yb=sc.nextDouble();
         double yc=sc.nextDouble();
         
         double p1=(xa+xb+xc)/2;
         double areaX= Math.sqrt(p1*(p1-xa)*(p1-xb)*(p1-xc));
         
         double p2=(ya+yb+yc)/2;
         double areaY=Math.sqrt(p2*(p2-ya)*(p2-yb)*(p2-yc));
         
         
         if(areaX > areaY){
             System.out.printf(" area x :  %.2f%n  ", areaX);
             System.out.printf(" area y :  %.2%n  ", areaY);
             System.out.println("triangulo x tem area maior ");
         } else{
             System.out.printf("area x :  %.2f%n  ", areaX);
             System.out.printf("area y : %.2f%n  ", areaY);
             System.out.println("triangulo y tem area maior");
         }
         sc.close();
    }
}
