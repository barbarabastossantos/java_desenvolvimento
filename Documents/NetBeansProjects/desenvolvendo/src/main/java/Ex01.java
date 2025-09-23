
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADM
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int[][]mat={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        System.out.println("""
                               Matrizes
                           
                           Escolha entre as linhas :
                           
                           Linha -> 0
                           Linha -> 1
                           Linha -> 2
                           
                           Escolha entre as colunas : 
                           
                           Coluna -> 0
                           Coluna -> 1
                           Coluna -> 2
                           
                           """);
        System.out.print(" Digite a linha desejada -> ");
        int i=sc.nextInt();
        System.out.print(" Digite a coluna desejada -> ");
        int j=sc.nextInt();
        
        System.out.println(" Voce escolheu o numero : "+ mat[i][j]);
        
        if(i-1 >=0){
            System.out.println(" O vizinho  desse numero e -> "+ mat[i-1][j]);
        }else{
            System.out.println(" Nao tem vizinho de cima!");
        }
        
        System.out.println(" \n Matriz ");
        
        for(int ii=0;ii< mat.length;ii++){
            for(int jj=0;jj< mat[i].length;jj++){
                System.out.print(mat[ii][jj] +" ");
            }
            System.out.println(" ");
        }
        
        
        
        sc.close();
    }
}
