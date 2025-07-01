/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_condicional;

import java.util.Scanner;
/**
 *
 * @author ADM
 */
public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite um numero : ");
        int n=sc.nextInt();
        
        if(n<0){
            System.out.println("Negativo");
        }
        else{
            System.out.println("Positivo");
        }
        
        sc.close();
           
    }
    
}
