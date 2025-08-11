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
public class Treino02 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        
        list.add("Marcelo");
        list.add("Marcela");
        list.add("Mauricio");
        list.add("Luanna");
        list.add("Leticia");
        list.add("Leonardo");
        
        for(String obj: list){
            System.out.println(obj);
        }
        System.out.println("==============\n");
        
        System.out.println("O indice  de Luanna e "+ list.indexOf("Luanna"));
        System.out.println("O indece de Marcelo e "+ list.indexOf("Marcelo"));
        System.out.println("O indice de Leonardo e "+ list.indexOf("Leonardo"));
        System.out.println(" A lista tem "+ list.size()+" de pessoas ");
    }
}
