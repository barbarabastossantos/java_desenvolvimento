/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADM
 */
public class Matriz {
    public static void main(String[] args) {
            
        //Matriz criada
        
        int [][] mat={
            {12,23,43},
            {9,5,8},
            {1,5,3}
        };
     
        // Numero que quero percorrer 
        
        int x=5;

        
        // Percorer cada linha
        
        for(int i=0; i< mat.length;i++){
            
            // Percorrer cada coluna 
            
            for(int j=0; j< mat.length;j ++){
                
                // if se achar o x depois de percorrer as linhas e colunas 
                if(mat[i][j] == x){
                    System.out.println("Encontrei o "+ x  + " na posicao ( "+ i+ ", " +j+ " ) ");
                    
                    // em cima
                    
                    if(i -1 >=0){
                        System.out.println(" Em cima : "+ mat[i-1][j]);
                    }
                    // em baixo
                    if(i+1 < mat.length){
                        System.out.println("Em baixo : "+ mat[i+1][j]);
                    }
                    //esquerda
                    if(j-1>=0){
                        System.out.println("Na esquerda : "+ mat[i][j-1]);
                    }
                    
                    // direita
                    
                    if(j+1< mat[i].length){
                        System.out.println("Na direita :  "+ mat[i][j+1]);
                    }
                }
            }
        }
        
        
        
        
    }
}
