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
public class exercicio08{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite um numero : ");
        int A=sc.nextInt();
        System.out.println("Digite outro numero : ");
        int B=sc.nextInt();
        
        if(A%B==0 || B%A==0) {
            System.out.println("Sao multiplos ");
        }
        else {
            System.out.println("Nao sao multiplos");
        }    
          sc.close();
    } 
    
}
