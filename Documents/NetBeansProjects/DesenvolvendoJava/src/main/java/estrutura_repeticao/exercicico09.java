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
public class exercicico09 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um numero : ");
        int x=sc.nextInt();
        
        if(x>=1 && x<=10000){
           for(int i=1;i<=x; i++){
               if(i%2!=0){
                   System.out.println(i);
               }
               
           }
        }
        else{
            System.out.println("Fora do intervalo");
        }
        
        
        
        
     sc.close();
    }
}
