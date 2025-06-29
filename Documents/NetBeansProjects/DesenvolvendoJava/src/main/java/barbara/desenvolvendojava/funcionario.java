/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.desenvolvendojava;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author ADM
 */
public class funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        int nfuncionario= sc.nextInt();
        double horas= sc.nextDouble();
        double valor= sc.nextDouble();
        
        double salario= horas*valor;
        
        System.out.printf(" numero do funcionario = %d \n salario = U$  %.2f ", nfuncionario, salario);
        
        sc.close();
        
        
    }
    
}
