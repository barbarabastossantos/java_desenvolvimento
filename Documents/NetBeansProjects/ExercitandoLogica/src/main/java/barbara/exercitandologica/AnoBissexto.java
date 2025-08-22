/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.exercitandologica;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class AnoBissexto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Digite o ano  : ");
        int ano=sc.nextInt();
        
        if(ano%4==0 && !(ano %100==0) || (ano %400==0)){ // if(ano%4==0 && ano%100!=0) -> aqui poderia usar o diferente ou  o nao 
            System.out.println(" Bissexto");
        }else{
            System.out.println(" Nao e bissexto");
        }
        
    
        
        sc.close();
    }
}
