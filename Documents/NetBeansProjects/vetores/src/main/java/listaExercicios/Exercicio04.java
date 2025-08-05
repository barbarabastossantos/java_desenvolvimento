/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExercicios;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author ADM
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        double[] vect=new double[4];
        System.out.println(" ");
        System.out.println(" Digite 4 numeros decimais : ");
        System.out.println(" ");
        for(int i=0;i<vect.length;i++){
            System.out.println(" Numero "+ (i+1) +" : ");
            vect[i]=sc.nextDouble();
        }
        double soma=0.0;
        for(int i=0;i<vect.length;i++){
            soma+=vect[i];
        }
        double media= soma/4;
        System.out.println(" ");
        System.out.printf(" A media desses numeros e -> %.2f%n  ",media);
    }
}
