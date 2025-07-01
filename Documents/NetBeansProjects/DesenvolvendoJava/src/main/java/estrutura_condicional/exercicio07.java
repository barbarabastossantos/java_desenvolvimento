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
public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        
        System.out.println("Digite um numero :");
        int numero=sc.nextInt();
        
        
        if(numero % 2==0){
            System.out.println("Numero par");
        }
        else{
            System.out.println("Numero impar");
        }
        
       sc.close();
    }
        
    
}
