
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADM
 */
public class ex001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[][] mat={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.print(" Escolha uma linha de 0 a 2 -> ");
        int i=sc.nextInt();
        System.out.print(" Escolha uma coluna de 0 a 2 -> ");
        int j=sc.nextInt();
        System.out.println(" Voce escolheu o numero "+ mat[i][j]);
        
        if(i-1 >=0){
            System.out.print(" O vizinho de cima e -> " + mat[i-1][j]);
        }else{
            System.out.println(" Nao tem vizinho! ");
        }
        
        System.out.println(" \n Matriz ");
        
        for(int ii=0;ii < mat.length; ii++){
            for(int jj=0; jj < mat[ii].length; jj++){
                System.out.print(mat[ii][jj] + " ");
            }
            System.out.println(" ");
        }
     sc.close();
    }
}