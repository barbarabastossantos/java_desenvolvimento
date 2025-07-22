/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formatandoString;

/**
 *
 * @author ADM
 */
public class separador {
    public static void main(String[] args) {
        String s="barbara mateus lucas"; // barbara//mateus//lucas
        String[] vect=s.split(" "); // vetor indica o indice e o split e o separador que indicamos sendo espco
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
