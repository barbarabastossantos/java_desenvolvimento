/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author ADM
 */
public class Treino03 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        
        list.add("Joao");
        list.add("Vinicius");
        list.add("Pedro");
        list.add("Debora");
        list.add("Danilo");
        list.add("Joana");
        
        for(String obj: list){
            System.out.println(obj);
        }
      
      List<String> resultado=list.stream().filter(obj -> obj.charAt(0)=='J').collect(Collectors.toList());
        System.out.println(" ====================\n");
       for(String obj: resultado){
            System.out.println(obj);
        }
    }
}
