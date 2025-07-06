/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_condicional;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author ADM
 */
public class exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Codigo : ");
        int cod=sc.nextInt();
        System.out.println("Quantidade : ");
        int quantidade=sc.nextInt();
        
        double valor;
        double pagar;
        
        if(cod==1){
            valor=4.00;
            pagar=valor*quantidade;
            System.out.printf("Valor a pagar R$ %.2f",pagar);
        }else if(cod==2){
            valor=4.50;
            pagar=valor*quantidade;
             System.out.printf("Valor a pagar R$ %.2f",pagar);
        }else if(cod==3){
            valor=5.00;
            pagar=valor*quantidade;
             System.out.printf("Valor a pagar R$ %.2f",pagar);
        }else if(cod==4){
            valor=2.00;
            pagar=valor*quantidade;
             System.out.printf("Valor a pagar R$ %.2f",pagar);
        }else if(cod==5){
            valor=1.50;
            pagar=valor*quantidade;
             System.out.printf("Valor a pagar R$ %.2f",pagar);
        }else{
            System.out.println("Opcao invalida. tente de novo");
        }
        sc.close();
    }
}
