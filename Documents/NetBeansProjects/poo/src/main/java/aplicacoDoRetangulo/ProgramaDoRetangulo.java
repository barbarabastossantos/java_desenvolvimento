/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacoDoRetangulo;
import java.util.Locale;
import java.util.Scanner;
import entidade2.Retangulo;
/**
 *
 * @author ADM
 */
public class ProgramaDoRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        Retangulo retangulo=new Retangulo();
        
        System.out.println("Qual a atura do retangulo :");
        retangulo.altura=sc.nextDouble();
        System.out.println("Qual a base do retangulo : ");
        retangulo.base=sc.nextDouble();
        System.out.println(" ");
        
        System.out.println(retangulo);
      
    }
}
