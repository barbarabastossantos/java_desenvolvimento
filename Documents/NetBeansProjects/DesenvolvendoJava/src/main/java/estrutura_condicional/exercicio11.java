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
public class exercicio11 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
         System.out.println("Inicio do turno: ");
         int inicioTurno =sc.nextInt();
         System.out.println("Fim do turno: ");
         int fimTurno=sc.nextInt();
         
         int duracao;
         
         //verificar a duracao do turno primeira condicao
         
         if(inicioTurno<fimTurno){
             duracao=Math.abs(inicioTurno-fimTurno);           
         }
         else{
             duracao=24-inicioTurno+fimTurno;
         }
         System.out.println("Tempo de durcao do turno : "+duracao);
            
         // verificar se o turno e valido
         
         if(duracao>=6 && duracao<=12){
             System.out.println("Turno valido");
         }else {
             System.out.println("Turno invalido");
         }  
         sc.close();
    }
    
}
