/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade4;

/**
 *
 * @author ADM
 */
public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    
    public double notaFinal(){
        return 
               nota1+nota2+nota3;
    }
    
    public String resultado(){
        
                if(notaFinal()>=60.00 && notaFinal()<=100){
                  return "Aprovado!";
                }else{
                    double falta= notaFinal()-60.00;
                  return "Reprovado! Faltam "
                          + Math.abs(falta)
                          + " pontos";
                }
                    
                
    }
}
