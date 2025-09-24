/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.matriz;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] mat= new int [3][3];
        
        for(int i=0; i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print("Digite o numero para a posicao ["+i+"]["+j+"] -> ");
                mat[i][j]=sc.nextInt(); 
            }
        }
         System.out.println(" \n MATRIZ \n");
        for(int ii=0;ii<mat.length;ii++){
            for(int jj=0;jj< mat[ii].length;jj++){
                System.out.print(mat[ii][jj]+" "); 
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" Digite a  linha de 0 a 2 -> ");
        int i=sc.nextInt();
        System.out.println("Digite a coluna de 0 a 2 -> ");
        int j=sc.nextInt();
        
        System.out.println(" O numero escolhido foi  "+ mat[i][j]);
        
        if(i-1<=0){
            System.out.println(" O vizinho e -> "+ mat[i-1][j]);
        }else{
            System.out.println(" nao tem vizinho");
        }
        
        
        
        
      sc.close();
    }
}
