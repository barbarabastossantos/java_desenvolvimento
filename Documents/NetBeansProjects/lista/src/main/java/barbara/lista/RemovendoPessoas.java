/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.lista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADM
 */
public class RemovendoPessoas {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        
        
        
        list.add("Anna");
        list.add("Julia");
        list.add("Angela");
        list.add("Antonio");
        list.add("Pedro");
        list.add("Leandro");
        list.add("Gustavo");
        
        System.out.println(" \n Lista de convidados \n");
        for(String obj: list){
            System.out.println(obj);
        }
        
        
        System.out.println(" \n Lista de convidados com "+ list.size() +" pessoas \n Removendo convidados .... \n");
        
        list.remove("Anna");
        list.remove("Leandro");
        list.remove("Angela");
         System.out.println(" Lista de convidados atualizada  com "+ list.size() + " pessoas ");
         
         for(String obj: list){
             System.out.println(obj);  
         }
        System.out.println(" \n Essas " + list.size() + " pessoas serao  confirmadas para a festa \n");
    }
}