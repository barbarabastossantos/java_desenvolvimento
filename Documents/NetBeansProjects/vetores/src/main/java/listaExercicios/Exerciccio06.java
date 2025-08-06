/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExercicios;

import java.util.Locale;

/**
 *
 * @author ADM
 */
public class Exerciccio06 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    
    double[] vect={4.6,7.5,9.2,6.8};//vetor ja com os numeros 
    
    for(int i=0;i<vect.length;i++){
        System.out.println(vect[i]);
    }
    double soma=0.0;
    for(int i=0;i<vect.length;i++){
     soma+=vect[i];
    }
    double media=soma/vect.length;
    
        System.out.printf(" media %.2f%n",media);
     }
    }