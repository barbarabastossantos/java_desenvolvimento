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
public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite um  numero : ");
        int N= sc.nextInt();
        int dentro =0;
        int fora=0;
        int x=0;
        for(int i =0; i<N;i++){
             x =sc.nextInt();
              if(x>=10 && x<=20){
                dentro++;
             
            }
            else{
                fora++;
                
            }   
        }
        
            System.out.println("in "+ dentro+ "\n out "+ fora);



        sc.close();
    }
}
