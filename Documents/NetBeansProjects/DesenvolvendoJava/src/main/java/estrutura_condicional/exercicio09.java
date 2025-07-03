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
public class exercicio09 {
           public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
               System.out.println("Digite hora inicial do jogo : ");
               int inicio=sc.nextInt();
               System.out.println("Digite hora final do jogo : ");
               int  fim =sc.nextInt();
               
               int duracao;
               
               if(fim>inicio) { // se a hora final for maior quue a inicial estamos no mesmo dia  entao so subtrai
                   duracao=fim-inicio;
               }
               else {
                   duracao= 24-  inicio+ fim; // senao subtrai 24(o dia tem 24horas) por hora inicial e soma co m o incio do outro dia
               }
               
               System.out.println("duracao do jigo : " + duracao);
               
               sc.close();
    }
    
}
