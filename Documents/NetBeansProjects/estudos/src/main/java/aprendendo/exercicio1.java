/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 .+*/
package aprendendo;
import java.util.Locale;
/**
 *
 * @author ADM
 */
public class exercicio1 {
    public static void main(String[] args) {
        String product1="Computer";
        String product2="Office desk";
        String nome="Barbara";
        
        int age= 30;
        int code=5290;
        
        char gender='F';
        
        double price1=2100.0;
        double prince2=650.50;
        double measure=53.234567;
        
        Locale.setDefault(Locale.US);
        
        String texto="""
                     
                     
                     ====================================================
                     
                     
                     Products:
                     %s , which price is $ %.2f
                     %s , which price is $ %.2f
                     
                     Record: %d years old, code %d and gender : %s
                     
                     Measue with eight decimal places : %.8f
                     Rouded tree decimal places : %.3f
                     
                     %s , parabens por estar se dedicando e avançando nos estudos de programação 
                     na liguagem java! SUCESSO !
                     
                     
                     ================================================================
                     """;
        
        
         System.out.printf(texto,product1,price1,product2,prince2,age,code,gender,measure,measure,nome);
        
        
              
    }
    
}
