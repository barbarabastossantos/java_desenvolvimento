/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.matrizees;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Exercicio01 {
    public static void main(String[] args) {
        //vizinho de cima simples
        Scanner sc=new Scanner(System.in);
        int[][]mat={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.println("""
                         
                              Vizinho de cima 
                           
                           Voce pode escolha entre linhas: 
                           
                           -> 0
                           -> 1
                           -> 2
                           
                           E entre as  colunas : 
                           
                           -> 0
                           -> 1
                           -> 2
                           
                           
                           """);
        System.out.print("Digite a posicao da linha desejada  -> ");
        int i=sc.nextInt();
        System.out.print("Agora digite a posicao da coluna  desejada -> ");
        int j=sc.nextInt();
        
        System.out.println(" Numero escolhido : "+ mat[i][j]);
        
        if (i -1>=0){
            System.out.println("Vizinho de cima : "+ mat[i -1][j]);
        }else{
            System.out.println(" Nao existe vizinho de cima.");
        }
      
        System.out.println(" \n Matriz \n");
        for(int ii=0; ii< mat.length;ii++){
            for(int jj =0; jj< mat[i].length;jj++){
                System.out.print(mat[ii][jj]+ " ");
            }
            System.out.println(" ");
        }
        
    }
}
