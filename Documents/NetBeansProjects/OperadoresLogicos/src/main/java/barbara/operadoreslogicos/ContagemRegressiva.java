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
public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println(" Contagem regressiva while\n");
        int n=10;
        int cont=0;
        while(n>=0){
            System.out.println(n);
          n= n-1;
        }
        System.out.println("");
        System.out.println(" Contagem regressiva for \n");
        
        for(int i=10;i>=0;i--){
            System.out.println(i);
        }
        sc.close();
    }
}
