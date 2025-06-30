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
public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        

        
        System.out.println("Quantas horas ? ");
        int hora= sc.nextInt();
        
        if (hora<12) {
            System.out.println("Bom Dia");
        }
        else {
            System.out.println("Boa Tarde");
        }
        
        sc.close();
    }
    
    
    
}
  
