/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.exercitandologica;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class DescontoCompra {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
         
        System.out.print("Digite valor da compra R$ : ");
        double valor=sc.nextDouble();
        
        if(valor> 100){
            double desconto=valor*10/100;
            double novoValor=valor-desconto;
            System.out.println(" Valor da compra aplicado 10% de desconto e ficou R$ "+ novoValor);
        }else{
            System.out.println("A compra nao ficou no valor de R$ "+ valor);
        }
        sc.close();
    }
}
