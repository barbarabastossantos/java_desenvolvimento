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
public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int x=sc.nextInt();
        int soma=0;
        
        while(x!=0){
            soma +=x;
            System.out.println("Digite um numero : ");
            x=sc.nextInt();
         
        }
        
        System.out.println("A soma dos numeros digitados : "+ soma);
        
        
        
        sc.close();
    }
}
