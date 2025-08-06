/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExercicios02;

/**
 *
 * @author ADM
 */
public class exercicio01 {
    public static void main(String[] args) {
        System.out.println("""
                         
                           SOMA DE ELEMENTOS DE UM VETOR 
                           
                           
                           """);
        
        int[] vect=new int[]{5,8,9,7,1};
        
        
        for(int i=0;i<vect.length;i++){
            System.out.println(" Na posicao "+(i+1)+ " -> "+ vect[i]);
        }
        int soma=0;
        
        System.out.println(" ");
        for(int i=0;i< vect.length;i++){
           soma+=vect[i]; 
        }
        System.out.println(" A SOMA DOS ELEMENTOS DO VETOR E " + soma );
    }
}
