/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.treino;

/**
 *
 * @author ADM
 */
public class Exercicio02 {
    public static void main(String[] args) {
        int[] numeros={10,3,8,9,5,0,4,7,1,5};
        
        int soma=0;
        for(int i=0;i< numeros.length;i++){
            System.out.println(numeros[i]);
        }
        for(int i=0;i< numeros.length;i++){
            soma+=numeros[i];
        }
        System.out.println("Soma "+soma);
        int par=0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]%2==0){
              par++;
              
            }
            
        }
        
        System.out.println("pares -> "+ par);
    }
}
