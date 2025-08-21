/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.exercitandologica;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class IMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Digite seu peso : ");
        double peso=sc.nextDouble();
        System.out.println(" Qual sua altura : ");
        double altura=sc.nextDouble();
        double imc= peso/ Math.pow(altura, 2);
        
        if(imc<18.5){
            System.out.println("Abaixo do peso");
            
        }else if(imc<= 24.9){
            System.out.println("Peso normal");
        }else if(imc <=29.9){
            System.out.println("Sobrepso");
        }else{
            System.out.println("Obsidade");
        }
        double pesoMinimo= 18.5* Math.pow(altura, 2); // pra saber o peso ideal e so inverter a conta divisao para multiplicacao
         double pesoMaximo= 24.9* Math.pow(altura, 2);
        System.out.printf(" Seu IMC e de %.2f%n", imc);
        System.out.printf(" Seu peso ideal minimo e de  %.2f%n e o peso ideal maximo e de %.2f%n ",pesoMinimo,pesoMaximo);
        
     sc.close();
    }
    
}
