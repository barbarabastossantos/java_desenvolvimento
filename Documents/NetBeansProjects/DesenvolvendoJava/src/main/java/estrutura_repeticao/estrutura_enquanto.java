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
public class estrutura_enquanto {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um numero : ");
        int x=sc.nextInt();
        
        while(x!=0){
            System.out.println("Digite um numero : ");
             x=sc.nextInt();
        }
        
        System.out.println("\n----------------FIM DO PROGRAMA!!------------\n");
        sc.close();
    }
}
