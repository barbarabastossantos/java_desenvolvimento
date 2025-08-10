
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
public class AdicionarPessoas {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>(); 
 //List e uma interface, java.util.List importa essa interface que tem os metodos com add, revome..
  //Como list e uma interface precisa de uma classe pra implementar um obj por isso usamos o ArrayList importando java.util.ArrayList
        System.out.println(" \n Adicionando pessoas a lista de convidados \n");     
             list.add("Anna");
             list.add("Vitoria");
             list.add("Angelica");
             list.add("Bruno");
             list.add("Vera");
             list.add("Edite");
             list.add("Jorge");
             list.add("Vinicius");
             
             System.out.println(list);
    }
            
}
