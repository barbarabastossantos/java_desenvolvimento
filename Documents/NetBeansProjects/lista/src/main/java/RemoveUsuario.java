
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADM
 */
public class RemoveUsuario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        List<String> list=new ArrayList<>();
        
       
  
    
        System.out.println(" Quantos convidados voce deseja inserir na lista ? ");
        int n=sc.nextInt();
        sc.nextLine();
        
        for(int i=1; i <= n;i++){
            System.out.print("Digite o nome da "+i+" -> ");
            String nome=sc.nextLine();
            
            list.add(nome);
        }
        
        System.out.println("\n Sua lista tem "+ list.size()+ " convidados \n ");
        
        for(String x: list){
            System.out.println(x);
        }
        
        System.out.println("\n Quantos convidados voce deseja  remover da lista ? ");
        int q=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<q;i++){
            System.out.print("Digite o nome da pessoa que sera removida -> ");
            String nome=sc.nextLine();
            
            list.remove(nome);
        }
        
        System.out.println(" \n Lista atualizada \n ");
        
        for(String x : list){
            System.out.println(x);
        }
        
        
        sc.close();
    }
}
