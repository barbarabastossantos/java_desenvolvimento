/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;

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
        
        int n= sc.nextInt();
        
        double[] vect=new double[n];
        //double[] vect -> double e o tipo de dado , [] significa que e um vetor , vect e minha variavel que vai ser meu vetor
        // new double[n] -> new significa que estamos criando algo novo na memoria, double e o tipo de dado e[n]indica quantos espacos meu vetor vai ter 
       
        for(int i=0;i<n;i++){
            // for  a variavel i vai ser nosso contador que comeca com zero assim como nosso vetor, i<n e nossa condicao, i++ e nosso incremento
            vect[i]=sc.nextDouble();
            //  vct[i] e a posicao do vetor 0,1,2.. e o sc.nextDouble() vai ser o numero que meu usuario vai digitar a cada incremento os numeros ganahm posicao no indice
        }
        double soma=0.0;
        for(int i=0;i<n;i++){
          soma+=vect[i]; // soma vai acumular nosso vetor que recebeu os valores digitados i e o indice 0,1,2 
        }
        
        double media= soma/3;
        System.out.printf(" media : %.2f%n " , media);
           sc.close();
    }
 
}
