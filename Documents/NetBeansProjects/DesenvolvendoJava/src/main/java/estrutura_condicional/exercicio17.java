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
public class exercicio17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("digite:");
        int num=sc.nextInt();
        
        int cont=50;
        
        if(num >100){
            cont=+(num-100)*2;
        }
        System.out.println(cont);
        sc.close();
    }
}
