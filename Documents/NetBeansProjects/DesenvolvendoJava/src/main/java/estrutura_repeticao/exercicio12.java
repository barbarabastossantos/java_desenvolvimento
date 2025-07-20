/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_repeticao;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author ADM
 */
public class exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        char r;
        do{
            System.out.println("qual a temperatura em celsius : ");
            double c=sc.nextDouble();
            double f=9*c/5+32;
            System.out.printf("equivalente em farenthtei : %.1f%n", f);
            System.out.println("deseja repetir : s/n ");
            r=sc.next().charAt(0);
        }while(r!='n');
      sc.close();
    }
            
}   
    

