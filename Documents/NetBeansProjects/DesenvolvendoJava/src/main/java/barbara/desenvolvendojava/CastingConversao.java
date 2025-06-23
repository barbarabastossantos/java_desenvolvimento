/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.desenvolvendojava;

/**
 *
 * @author ADM
 */
public class CastingConversao {
    public static void main(String[] args) {
        //Casting em Java é a conversão de um tipo de dado para outro
        // Casting implicito -> automatico, quando não ha risco de perda de dados
        // Casting explicito -> manual, quando ha risco de perda de dados  e o Java exige que vc informe isso
        
        // exemplo de casting implicito 
        
        int numero=10;
        double resultado=numero;
        System.out.println("Casting implicito "+ resultado);
        // não perdemos nenhuma informação
        
        
        
        // exemplo de casting explicito
        
        double a=5.7;
        int b=(int)a;
        // Aqui vc indica para o java que não se importa em perder a parte decimal  usando o tipo int
        // como queremos um tipo inteiro  de um numero double  vai acontecer a truncagem
        
        System.out.println("Numero do tipo double  " + a);
        System.out.println("Numero double com Casting int "+ b);
    }
    
}
