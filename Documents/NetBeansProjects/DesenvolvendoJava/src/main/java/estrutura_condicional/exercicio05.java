/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_condicional;
import java.util.Scanner;
//import java.util.Locale;
/**
 *
 * @author ADM
 */
public class exercicio05 {
       public static void main(String[] args) {
   //     Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
           System.out.println("Qual a temperatura ? ");
           double temperatura=sc.nextDouble();
             
           if(temperatura<0){
               System.out.println("Muito frio");
           } else if(temperatura <=14){
               System.out.println("frio");
           } else if(temperatura<=24){
               System.out.println("clima ameno");
           } else if(temperatura <=35){
               System.out.println("calor");
           } else if( temperatura >35){
               System.out.println("muito calor");
           }
              
           
           
           
           
       sc.close();
    }
    
}
