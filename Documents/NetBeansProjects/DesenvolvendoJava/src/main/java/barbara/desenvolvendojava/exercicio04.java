/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.desenvolvendojava;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author ADM
 */
public class exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        double largura;
        double comprimento;
        double valormetro;
        
        largura= sc.nextDouble();
        comprimento=sc.nextDouble();
        valormetro=sc.nextDouble();
        
        double area = largura*comprimento;
        double preco = area*valormetro;
        
        System.out.printf("area : %.2f ",area);
        System.out.printf("preco : %.2f ",preco);
        
        sc.close();
        
        
    }
    
}
