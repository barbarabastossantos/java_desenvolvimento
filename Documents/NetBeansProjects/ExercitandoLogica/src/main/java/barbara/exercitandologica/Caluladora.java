/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.exercitandologica;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Caluladora {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite dois numeros ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
        System.out.println("""
                           
                           
                           Escolha : 
                           
                           1 -> adicao
                           2 -> subtracao
                           3 -> multiplicacao
                           4 -> divisao
                           
                           """);
        int opc =sc.nextInt();
        
        if(opc == 1){
            int result= n1+n2;
            System.out.println(result);
        }else if(opc ==2){
            int result= n1-n2;
            System.out.println(result);
        }else if(opc == 3){
            int result= n1*n2;
            System.out.println(result);
        }else if(opc ==4){
            if( n2 != 0){ // fazer essa verificaco pra nao da erro
            double result=(double)n1/n2;
            System.out.printf("%.2f%n",result);
            }else{
                System.out.println("Divisao invalida nao pode dividir 0");
                
            }
            
        }else{
            System.out.println("Opcao invalida ");
        }
        
        sc.close();
    }
}
