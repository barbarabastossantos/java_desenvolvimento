/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.operadoreslogicos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class MediaConceito {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite suas quatro notas ");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double n3=sc.nextDouble();
        double n4=sc.nextDouble();
        
        double media=(n1+n2+n3+n4)/4;
    
        if(media >=9){
            System.out.printf(" Sua media foi de %.2f%n e seu conceito e  A",media);
        }else if(media >=7){
            System.out.printf("Sua media foi de %.2f%n e seu conceito e B ",media);
        }else if(media >=5){
            System.out.printf("Sua media foi de %.2f%n e seu conceito e C",media);
        }else{
            System.out.printf("Sua media foi de %.2f%n e seu conceito e D",media);
        }
        
        sc.close();
    }
}
