/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_repeticao;
import java.util.Scanner;
/**
 *
 * @author ADM
 */
public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("""
                           --------------------------------------------
                           --------------------------------------------
                                   POSTO DE GASOLINA BASTOS
                           --------------------------------------------
                           --------------------------------------------
                           
                           [1]Alcool
                           [2]Gasolina
                           [3]Dissel
                           [4]Sair
                           
                           """);
              int num=sc.nextInt();
        int alcool=0;
        int gasolina=0;
         int disel=0;
        
      
        while(num!=4){
             System.out.println("""
                           --------------------------------------------
                           --------------------------------------------
                                   POSTO DE GASOLINA BASTOS
                           --------------------------------------------
                           --------------------------------------------
                           
                           [1]Alcool
                           [2]Gasolina
                           [3]Dissel
                           [4]Sair
                           
                           """);
           
         if(num==1) {
           alcool++;
            num=sc.nextInt();
         }else if(num==2){
             gasolina++;
              num=sc.nextInt();
         }else if(num==3){
           disel++;
             num=sc.nextInt();
         }else{
             System.out.println("opcap invalida");
             num=sc.nextInt();
         }  
        }
        
        System.out.printf(" Alcool : %d \n Gasolina : %d \n Dissel : %d",alcool,gasolina,disel);
        System.out.println("\n Muito obrigada \n");
        
        sc.close();
    }
}
