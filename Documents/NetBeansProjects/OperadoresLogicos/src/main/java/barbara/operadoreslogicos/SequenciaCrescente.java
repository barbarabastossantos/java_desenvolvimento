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
public class SequenciaCrescente {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite tres numeros");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        
        
        if(n1<n2 && n1<n3 && n2< n3){
            System.out.println(" esta em ordem crescente");
        }else if( n3<n2 && n3<n1 && n2<n1){
            System.out.println(" esta em ordem descente");
        }else{
            System.out.println(" nao esta em nenhuma ordem");
        }
                
        
        
        sc.close();
    }
}
