/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExercicios02;

import java.util.Locale;

/**
 *
 * @author ADM
 */
public class Exercicio02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        System.out.println("""
                           
                           MEDIA DE VALORES ARMAZENADOS
                           
                           """);
        
        double[] vect=new double[]{9.8,2.5,8.5,3.5};
        
        for(int i =0;i<vect.length;i++){
            System.out.println(" Na posicao "+(i+1)+" -> "+ vect[i]);   
        }
        System.out.println(" ");
        
        double soma =0.0;
        
        for(int i=0;i<vect.length;i++){
            soma+=vect[i];
        }
       double media =soma/vect.length;
       
        System.out.printf(" A media dos vetores e %.2f%n ",media);
    }
}
