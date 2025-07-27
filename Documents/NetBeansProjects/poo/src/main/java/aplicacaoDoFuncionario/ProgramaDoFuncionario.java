/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoDoFuncionario;
import java.util.Locale;
import java.util.Scanner;
import entidade3.Funcionario;
/**
 *
 * @author ADM
 */
public class ProgramaDoFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        Funcionario funcionario=new Funcionario();
        
        System.out.println("nome: ");
        funcionario.nome=sc.nextLine();
        System.out.println(" salario bruto : ");
        funcionario.salarioBruto=sc.nextDouble();
        System.out.println(" imposto : ");
        funcionario.imposto=sc.nextDouble();
        
        System.out.println("dados do funcionario "+funcionario);
        System.out.println(" ");
        
        System.out.println("Qual porcentagem de aumneto salarial : ");
        double porcentagem=sc.nextDouble();
        funcionario.aumentoSalario(porcentagem);
        
        System.out.println(" ");
        System.out.println("atualizacoes do funcionario : "+ funcionario );
        
        sc.close();
    }
}
