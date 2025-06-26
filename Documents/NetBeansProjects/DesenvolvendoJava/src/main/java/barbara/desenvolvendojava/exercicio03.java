/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.desenvolvendojava;


import java.util.Locale;
/**
 *
 * @author ADM
 */
public class exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double largura=10.0;
        double comprimento=30.0;
        double valormetro=200.00;
        
        
        double area = largura*comprimento;
        double preco= area*valormetro;
        
        System.out.printf(" Area : %.2f \n", area );
        System.out.printf(" Preco : %.2f " , preco );
    }
    
}
