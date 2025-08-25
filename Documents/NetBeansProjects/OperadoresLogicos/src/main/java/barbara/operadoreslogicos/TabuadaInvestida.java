/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.operadoreslogicos;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class TabuadaInvestida {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite um numero ");
        int n=sc.nextInt();
        
        for(int i=10;i>0;i-- ){
            System.out.println(n + " x "+ i + " = "+ (i*n));
        }
        
        
        sc.close();
    }
}
