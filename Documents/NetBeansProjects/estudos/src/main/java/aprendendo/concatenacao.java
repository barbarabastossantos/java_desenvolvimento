/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package aprendendo;
import java.util.Locale;
/**
 *
 * @author ADM
 */
public class concatenacao {
    public static void main(String[] args) {
        String nome="Barbara";
        int idade=30;
        double renda=4500.0;
        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n ", nome,idade,renda);
    }
    
}
