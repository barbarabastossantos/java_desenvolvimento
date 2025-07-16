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
public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Qual numero voce quer ve na tabuada da multiplicacao : ");
        int n=sc.nextInt();
        
        for(int i=1;i<11;i++){
            System.out.println(i + " X "+ n +" = "+ i*n);
        }
        sc.close();
    }
}
