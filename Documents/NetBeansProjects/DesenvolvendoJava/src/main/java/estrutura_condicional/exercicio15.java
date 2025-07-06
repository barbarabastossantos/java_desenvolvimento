/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura_condicional;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ADM
 */
public class exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite um numero : ");
        double numero=sc.nextDouble();
        
        if(numero>=0 && numero<=25){
            System.out.println("intervalo(0,25)");
        }else if(numero>25 && numero<=50){
            System.out.println("intervalo(25,50)");
        }else if(numero>50 && numero<=75){
            System.out.println("intervalo(50,75)");
        }else if(numero>75 && numero >=100){
            System.out.println("intervalo(75,100)");
        }else{
            System.out.println("fora do intervalo");
        }
        sc.close();
    }
    
}
