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
public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("""
                         
                         ----------------------------------------------
                           
                           Bem vindo ao Estacionamento Bastos!
                           
                             -> O Estacionamneto funciona 24h.
                             -> Valor do servico R$ 5.00 por hora de permanecia.
                      
                           
                           ---------------------------------------------------
                           
                           
                           """);
        System.out.println(" Digite a hora de entrada no estacionamneto : ");
        int horaInicial=sc.nextInt();
        System.out.println(" Digite a hora de saida do estacionamneto : ");
        int horaFinal=sc.nextInt();
        int duracao,valorPagar;
        
        if(horaFinal>horaInicial) {
            duracao=Math.abs(horaInicial-horaFinal); // tive que usar valor absoluto para tirar o sinal negativo
            
        }
        else{
            duracao=24-horaInicial+horaFinal;
        }
       
        valorPagar=duracao*5;
        
        System.out.printf(" CARREGANDO.... \n  Duracao do uso do servico : %d horas \n Valor a pagar : R$  %d ", duracao,valorPagar, "\n Estacionamento Bastos agradece sua preferncia!");
       sc.close();
    }
}
