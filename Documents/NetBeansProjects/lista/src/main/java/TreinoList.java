
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
public class TreinoList {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        
        list.add("Joana");
        list.add("Lucia");
        list.add("Joao");
        list.add("Vera");
        list.add("Veronica");
        list.add("Lucas");
        
        for(String obj: list){
            System.out.println(obj);
        }
        
        list.removeIf(obj -> obj.charAt(0)=='L');
        System.out.println(" ======================== \n");
        for(String obj: list){
            System.out.println(obj);
        }
        
        list.removeIf(obj -> obj.charAt(0)=='J');
        
        System.out.println("==============================\n");
        
        for(String obj : list){
            System.out.println(obj);
        }
    }
}
