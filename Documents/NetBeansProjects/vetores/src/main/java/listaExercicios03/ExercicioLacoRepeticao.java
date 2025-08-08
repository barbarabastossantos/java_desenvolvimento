/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExercicios03;

/**
 *
 * @author ADM
 */
public class ExercicioLacoRepeticao {
    
    public static void main(String[] args) {
        
        String[] vect=new String[]{"Maria","Joana","Lurdes","Pedro"};
        
        for(int i=0; i<vect.length;i++){
            System.out.println(vect[i]);
        }
        
        System.out.println("===================================\n================================");
        for(String obj: vect){
            System.out.println(obj);
        }
    }
}
