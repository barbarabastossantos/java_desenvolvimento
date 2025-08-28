
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADM
 */
public class Lista01 {
    public static void main(String[] args) {
        List<String> alunos=new ArrayList<>();
        
        alunos.add("Marcos");
        alunos.add("Leticia");
        alunos.add("Andre");
        alunos. add("Bruno");
        
        
        System.out.println(" ");
        
        System.out.println(alunos);
        
        
        System.out.println(" ");
        
        
        for(String aluno: alunos){
            System.out.println(aluno);
        }
        
        
        System.out.println(" ");
        
        
        for(int i=0; i< alunos.size();i++){
            System.out.println(" Na posicao "+ i+ "  esta -> "+alunos.get(i));
        }
        
        System.out.println(" ");
        
        alunos.add(1,"Barbara");
        alunos.add(2,"Eliana");
        System.out.println(" \n Lista atualizada \n");
      for( int i=0;i< alunos.size();i++){
          System.out.println("Na posicao "+i+" esta -> "+alunos.get(i));
      }
      
      alunos.remove(0);
      alunos.remove("Leticia");
           System.out.println(" \n Lista atualizada \n");
      
       for(String aluno: alunos){
            System.out.println(aluno);
        }
       
        System.out.println("\n Lista atualizada \n");
       alunos.clear();
       
        System.out.println(alunos);
    }
}
