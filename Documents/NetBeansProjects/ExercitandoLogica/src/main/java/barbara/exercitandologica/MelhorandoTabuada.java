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
public class MelhorandoTabuada {
       public static void main(String[] args) {
         Locale.setDefault(Locale.US);
         
        Scanner sc=new Scanner(System.in);
        
        int opcao=0;
        while(opcao !=5){
            
           System.out.println("""
                              
                              =============== TABUADA ==========
                              
                              Qual dessas operacoes voce deseja ve na tabuada : 
                              
                              ADICAO       -> 1
                              SUBTRACAO    -> 2
                              DIVISAO      -> 3
                              MULTPLICACAO -> 4
                              SAIR         -> 5
                              
                              
                              """);
         opcao=sc.nextInt();
           
         if(opcao==1){
              System.out.println("Agora um numero que deseja ve dessa operacao ");
            int n=sc.nextInt();
             System.out.println(" \nVoce escolheu operacao de ADICAO\n");
             
             tabuadaAdicao(n);
         } else if(opcao==2){
              System.out.println("Agora um numero que deseja ve dessa operacao ");
            int n=sc.nextInt();
               System.out.println(" \nVoce escolheu operacao de SUBTRACAO\n");
             tabuadaSubtracao(n);
         }else if(opcao==3){
              System.out.println("Agora um numero que deseja ve dessa operacao ");
            int n=sc.nextInt();
               System.out.println(" \nVoce escolheu operacao de DIVISAO\n");
             tabuadaDivisao(n);
         }else if(opcao==4){
              System.out.println("Agora um numero que deseja ve dessa operacao ");
            int n=sc.nextInt();
               System.out.println(" \nVoce escolheu operacao de MULTPLICACAO\n");
             tabuadaMultiplicacao(n);
         } else{
             System.out.println("Ops! opcao invalida");
         }
        }
        
           System.out.println("Voce escolher a opcao SAIR....");
        
        sc.close();
    }
       public static void tabuadaAdicao(int n){
           for(int i=1;i<=10;i++){
              int result= n+i;
               System.out.println(n+" + "+i+" = "+ result);
           }
       }
       
       public static void tabuadaSubtracao(int n){
           for(int i=1;i<=10;i++){
              int result= n-i;
               System.out.println(n+" - "+i+" = "+ result);
           }
       }
       
       public static void tabuadaDivisao(int n){
           for(int i=1;i<=10;i++){
              double result=(double) n+i;
               System.out.printf("%d / %d = %.2f%n",n,i,result);
           }
       }
       
       public static void tabuadaMultiplicacao(int n){
           for(int i=1;i<=10;i++){
              int result= n*i;
               System.out.println(n+" * "+i+" = "+ result);
           }
       }
}
