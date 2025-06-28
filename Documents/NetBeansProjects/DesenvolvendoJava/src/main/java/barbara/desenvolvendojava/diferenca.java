/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.desenvolvendojava;


import java.util.Scanner;
/**
 *
 * @author ADM
 */
public class diferenca {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        int D= sc.nextInt();
        
        int diferenca=(A*B-C*D);
        
        System.out.println("DIFERENCA = "+ diferenca);
        
        sc.close();
    }
    
}
