/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_repeticao;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author ADM
 */
public class exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        double n1=0;
         double n2=0;
         double n3 =0;
          double media=0;
        
        for(int i=1; i <=N;i++) {
         n1=sc.nextDouble();
         n2=sc.nextDouble();
         n3=sc.nextDouble();
            
        media= (n1*2.0+n2*3.0+n3*5.0)/ 10.0; 
            System.out.println("Resultado da media "+i);
          System.out.printf(" %.1f%n",media);
        }
       
      sc.close();
    }
}
