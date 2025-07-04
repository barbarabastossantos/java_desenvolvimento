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
public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Saida : ");
        int saida=sc.nextInt();
        System.out.println("Chegada : ");
        int chegada=sc.nextInt();
        
        int duracao;
        
        if (saida<chegada){
            duracao=Math.abs(saida-chegada);
        }
        else{
            duracao=24-saida+chegada;
        }
         System.out.println("A viagen durou : "+ duracao +" horas");
        
        sc.close();
        
        
        
    }
    
}
