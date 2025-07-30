/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoBanco;
import java.util.Locale;
import java.util.Scanner;
import entidade1.Banco;
/**
 *
 * @author ADM
 */
public class Programa {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Banco banco;
        
        System.out.println("Digite numero da conta : ");
        int conta=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o nome do titular da conta : ");
        String nome=sc.nextLine();
        
        System.out.println("Deseja fazer um deposito inicial ? \n Digite o numero correspondente  a sua escolha : \n 1->sim \n 2 ->nao");
        String resp=sc.nextLine();
        
        
        if(resp.equals("1")){
            System.out.println("Qual valor deseja depositar inicialmente ? ");
            double depositoInicial=sc.nextDouble();
            sc.nextLine();
            
            banco=new Banco(nome,conta,depositoInicial);
            
            System.out.println("Dados da conta atualizados : "+banco);
            
            System.out.println("Deseja fazer mais um deposito "+ nome +" ? \n Se desejar digite 1 senao digite 2");
            String resp2=sc.nextLine();
            
            if(resp2.equals("1")){
                System.out.println("Qual valor deseja depositar ? ");
                double deposito=sc.nextDouble();
                banco.depositoConta(deposito);
                sc.nextLine();
                
                System.out.println(" Dados da conta atualizados : "+ banco);
                
                System.out.println("Deseja realizar um saque "+ nome+ " ? \n Se desejar digite 1 senao digite 2 ");
                String resp3=sc.nextLine();
                
                if(resp3.equals("1")){
                    System.out.println(nome+" qual valor do saque ? ");
                    double saque=sc.nextDouble();
                    banco.saqueConta(saque);
                    sc.nextLine();
                    
                    System.out.println(" Atualizacao dos dados da conta : "+ banco +" Muito obrigada por utilizar nossos servicos !");
                }else{
                    System.out.println("Muito obrigada por usar nossos servicos!");
                
                }
                
            }else{
                System.out.println("Muito obrigada por usar nossos servicos !");
            }
        }else{
            banco=new Banco(nome,conta);
            System.out.println(banco);
             
            System.out.println("Deseja fazer um deposito "+ nome+ " ? \n Se sim digita 1 senao digite 2");
            String resp4=sc.nextLine();
            
            if(resp4.equals("1")){
                System.out.println("Qual valor deseja depositar ? ");
                double deposito=sc.nextDouble();
                banco.depositoConta(deposito);
                sc.nextLine();
                System.out.println("Atualizacao da conta : "+ banco );
                System.out.println(nome+" deseja fazer um saque ? \n se sim digite 1 senao digite 2");
                String resp5=sc.nextLine();
                
                if(resp5.equals("1")){
                    System.out.println("Qual valor do saque "+ nome +" ? ");
                    double saque=sc.nextDouble();
                    banco.saqueConta(saque);
                    sc.nextLine();
                    
                    System.out.println(" Atualizacao da conta \n "+ banco+" \n Muito obrigada por usar nossos servicos !");
                } else{
                    System.out.println(" Muito obrigada por usar nossos servicos !");
                }
            }else{
                System.out.println("Muito obrigada por usar nossos servicos !");
            }
            
        }
        
        
        
        
        
        
        
        
        
        sc.close();
    }
 
}
