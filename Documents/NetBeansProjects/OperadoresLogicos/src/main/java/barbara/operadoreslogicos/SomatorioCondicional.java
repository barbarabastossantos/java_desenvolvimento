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
public class SomatorioCondicional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int soma=0;
        int n;
        int cont=0;
        do{
            System.out.println("Digite um numero ");
            n=sc.nextInt();
            
            cont++;
            
            if(n>0){
                soma+=n;
            }
        } while(n!=0);
          
           System.out.println("QUANTIDADE DE NUMEROS DIGITADOS -> "+ (cont-1)); 
           System.out.println("SOMA DOS NUMEROS POSITIVOS -> "+ soma);
        
        
        
        
        sc.close();
    }
}
