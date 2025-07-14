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
public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Qual numero voce deseja ve a tabuada da multiplicacao : ");
        int num=sc.nextInt();
        int contador=0;
        int tabuada=1;
        while(contador<10){
            contador=contador+1;
            tabuada=contador*num;
            
            System.out.println(num + " X " + contador + " = " + tabuada);
            
        }
        
        
        
        
        
        sc.close();
    }
}
