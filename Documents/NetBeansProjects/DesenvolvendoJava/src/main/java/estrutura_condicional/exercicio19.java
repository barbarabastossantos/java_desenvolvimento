/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author ADM
 */
public class exercicio19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        
      
        
        double preco=34.5;
        
        double desconto=(preco<20.0)? preco*0.1:preco*0.05;
        System.out.println(desconto);
        sc.close();
    }
    
}
