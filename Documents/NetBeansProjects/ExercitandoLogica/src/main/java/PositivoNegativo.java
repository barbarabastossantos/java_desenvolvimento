
import java.util.Scanner;

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADM
 */
public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro positivo ou negativo : ");
        int n=sc.nextInt();
        
        if(n<0){
            System.out.println(" Esse numero e Negativo");
        } else {
            System.out.println(" Esse numero e Positivo ");
        }
        
        sc.close();
    }
}
