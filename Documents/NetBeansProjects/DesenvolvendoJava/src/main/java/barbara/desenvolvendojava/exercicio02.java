/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.desenvolvendojava;

/**
 *
 * @author ADM
 */
public class exercicio02 {
    public static void main(String[] args) {
        // primeiro ex -> de double para int
        
        double idade=25.5;
        int b=(int)idade;
        
        System.out.println("Idade fornecida "+ idade + "\n Idade convertida " + b);
        
      
       // segundo ex -> de int para double
       
       int total=9;
       int quant=2;
       double resultado= (double) total/quant;
       int r=total/quant;
       
        System.out.println("Resultado com casting double "+resultado + "\n Resultado int " + r);
    }
    
}
