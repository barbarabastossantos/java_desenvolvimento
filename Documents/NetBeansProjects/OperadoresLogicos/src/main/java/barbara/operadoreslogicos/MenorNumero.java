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
public class MenorNumero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite tres numeros");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        
        if(n1<n2 && n1<n3){
            System.out.println(n1+ " e o menor");
        }else if(n2<n1 && n2 < n3){
            System.out.println(n2 +" e menor ");
        }else{
            System.out.println(n3+ " e o menor");
        }
        
        sc.close();
    }
}
