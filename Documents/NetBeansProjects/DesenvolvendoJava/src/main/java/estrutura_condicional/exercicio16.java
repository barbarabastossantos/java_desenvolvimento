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
public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("""
                           -----------------------------------------------------------
                           -----------------------------------------------------------
                           Digite o dia da semana de acordo com os seguintes numeros :
                           
                           [1] Domingo
                           [2] Segunda-feira
                           [3] Terca-feira
                           [4] Quarta-feira
                           [5] Quinta-feira
                           [6] Sexta-feira
                           [7] Sabado
                           
                           De acordo com a numeracao que dia e hoje da semana : 
                          ___________________________________________________________
                           _____________________________________________________________
                           
                           """);
        int numero=sc.nextInt();
        
        
        if(numero==1){
            System.out.println("Domingo");
        }else if(numero==2){
            System.out.println("Segunda");
        }else if(numero==3){
            System.out.println("Terca");
        }else if(numero==4){
            System.out.println("Quarta");
        }else if(numero==5){
            System.out.println("Quinta");
        }else if(numero==6){
            System.out.println("Sexta");
        }else if(numero==7){
            System.out.println("Sabado");
        }else{
            System.out.println("Opcao invalida");
        }
        sc.close();
    }
}
