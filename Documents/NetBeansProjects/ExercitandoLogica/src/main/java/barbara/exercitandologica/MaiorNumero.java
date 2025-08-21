/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.exercitandologica;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite dois numeros");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        
        if(n1>n2){
            System.out.println(n1+" e maior que "+n2);
        }else{
            System.out.println(n2+" e maior que "+n1);
        }
        
        
        sc.close();
    }
}
