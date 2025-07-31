/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoVetor;
  import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ADM
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        double[] vect=new double[n];
        
        for( int i=0;i<n;i++){
            vect[i]=sc.nextDouble();
        }
         double sum=0;
         for(int i=0;i<n;i++){
             sum+=vect[i];
         
         }   
        
        double media=sum/n;
        
        System.out.printf("media -> %.2f%n ", media);
        sc.close();
    }
}
