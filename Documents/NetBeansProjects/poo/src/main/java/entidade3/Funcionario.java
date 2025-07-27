/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade3;

/**
 *
 * @author ADM
 */
public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;
    
    public double salarioLiquido(){
        return salarioBruto - imposto;
    }
    
    public void aumentoSalario(double porcentagem){
        salarioBruto+= (salarioBruto*porcentagem)/100;//salarioBruto depois do aumento vai ser salario que eu ja tinha mais o calculo do aumento
    }
    
    public String toString(){
        return nome
                + " R$  "
                + String.format("%.2f ", salarioLiquido());
                
                
                
               
           
    }
    
}
