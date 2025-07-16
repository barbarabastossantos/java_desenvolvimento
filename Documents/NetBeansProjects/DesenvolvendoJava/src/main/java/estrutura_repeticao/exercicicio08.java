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
public class exercicicio08 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite um numero para ve-lo em contagem regressiva : ");
        int n=sc.nextInt();
        
        for(int i=n;i>=0;i--){
            System.out.println(i);
        }
        sc.close();
    }
}
