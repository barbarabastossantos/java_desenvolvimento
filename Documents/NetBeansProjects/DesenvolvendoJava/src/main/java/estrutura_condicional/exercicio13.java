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
public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
         System.out.println("Qual e sua idade ? ");
         int idade=sc.nextInt();
         
         if(idade>=18 && idade<=60){
             System.out.println("Idade dentro do intervalo permitido.");
         }
         else{
             System.out.println("Idade fora do intervalo permitido");
         }
         sc.close();
    }
}
