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
public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Qual sua idade ? ");
        int idade =sc.nextInt();
        
        if(idade >=0 && idade <=12){
            System.out.println("Voce e crianca!");
    }
        else{
            if (idade>=13 && idade <=17) {
                System.out.println("Voce e adolescente !");
            
            } else{
                 if (idade>=18 && idade <=59){
                     System.out.println("Voce e adulto!");
                 } else{
                     if(idade>=60){
                         System.out.println("Voce e idoso!");
                     }else{
                         if(idade<0){
                             System.out.println("idade invalida!");
                         }
                     }
                 }
            }
        }
        sc.close();
  }   
}
