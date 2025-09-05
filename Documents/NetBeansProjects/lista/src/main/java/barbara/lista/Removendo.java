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
public class Removendo {
    public static void main(String[] args) {
     List<String> list=new ArrayList<>();
     
     list.add("Maria");
     list.add("Luana");
     list.add("Marcelo");
     list.add(0,"Barbara");
     list.add("Luiza");
     list.add("Luiz Antonio");
     list.add("Pedro");
     list.add("Antonio");
     
     for(String x:list){
         System.out.println(x);
     }
        System.out.println(" tamanho da lista -> "+ list.size());
        System.out.println(" \n Nova lista sem nomes com a inicial M \n ");
        
        list.removeIf(x-> x.charAt(0)=='M');
     for(String x: list){
         System.out.println(x);
     }
        System.out.println(" Tmanho da lista -> "+ list.size());
     System.out.println(" ");
         list.removeIf(x->x.charAt(x.length()-1)=='o');
        System.out.println(" \n Novva lista sem nomes com a segunda letra do nime 0");
      for(String x: list){
         System.out.println(x);
     }
        System.out.println("Tamanho da lista -> "+ list.size()); 
    }
}
