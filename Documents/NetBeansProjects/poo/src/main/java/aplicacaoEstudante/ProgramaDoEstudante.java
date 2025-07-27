/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoEstudante;
import java.util.Locale;
import java.util.Scanner;
import entidade4.Estudante;
/**
 *
 * @author ADM
 */
public class ProgramaDoEstudante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        Estudante estudante=new Estudante();
        
        System.out.println(" Qual seu nome :");
        estudante.nome=sc.nextLine();
        System.out.println("sua primeira nota : ");
        estudante.nota1=sc.nextDouble();
        System.out.println("sua segunda nota : ");
        estudante.nota2=sc.nextDouble();
        System.out.println(" sua terceira nota : ");
        estudante.nota3=sc.nextDouble();
        
        System.out.println(" ");
        
        System.out.println("nota final : "+estudante.notaFinal());
        
        System.out.println(" ");
        
        System.out.println(estudante.resultado());
    }
    
}
