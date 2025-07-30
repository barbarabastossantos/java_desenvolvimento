/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade1;

/**
 *
 * @author ADM
 */
public class Banco {
    public String nome;
    private int conta;
    private double depositoInicial;
    private double saldo;
    
   public Banco(){
       
   }
    
   public Banco(String nome,int conta,double depositoInicial){
       this.nome=nome;
       this.conta=conta;
       this.depositoInicial=depositoInicial;
       this.saldo=depositoInicial;
   }
   public Banco(String nome,int conta){
       this.nome=nome;
       this.conta=conta;
       this.saldo=depositoInicial;
   }

    public int getConta() {
        return conta;
    }

   
    public double getSaldo() {
        return saldo;
    }
   
   public void depositoConta(double deposito){
       this.saldo+=deposito;
       
   }  
   
   public void saqueConta(double saque){
       this.saldo-=saque;
   }
  
   public String toString(){
       return " \n Dados da conta \n Numero da conta -> :"+ conta
               + "\n Nome do titular da conta ->  "+ nome+" Saldo em conta -> R$ "+ String.format("%.2f%n ", saldo);
   }
   
   
}
