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
public class Exercio02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[][] mat={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        
        System.out.print("Digite a linha de 0 a 3 -> ");
        int i=sc.nextInt();
        System.out.print("Digite a coluna de 0 a 3 -> ");
        int j= sc.nextInt();
        
        System.out.println(" O numero escolhido foi -> "+ mat[i][j]);
        
        if(i-1>=0){
            System.out.print("O vizinho de cima e -> "+ mat[i-1][j]);
        }else{
            System.out.println(" Nao tem vizinho de cima ");
        }
        
        System.out.println("\n MATRIZ \n");
        
        for(int ii=0;ii< mat.length;ii++){
            for(int jj=0;jj < mat[ii].length;jj++){
                System.out.print(mat[ii][jj]+ " ");
            }
            System.out.println(" ");
        }
        
        sc.close();
    }
}
