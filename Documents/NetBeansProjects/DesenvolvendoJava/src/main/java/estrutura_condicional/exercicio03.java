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
public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Quantas horas ? ");
        int horas=sc.nextInt();
        
        if(horas<12) {
            System.out.println("Bom dia!");
        }
        else{
            if(12<=horas && horas<18) {
                System.out.println("Boa tarde");
            } else {
                 System.out.println("Boa noite");  
               }
        }
     sc.close();
    }  
}  
