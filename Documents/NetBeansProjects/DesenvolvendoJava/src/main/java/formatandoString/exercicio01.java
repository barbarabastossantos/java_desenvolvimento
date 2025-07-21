/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formatandoString;

/**
 *
 * @author ADM
 */
public class exercicio01 {
    public static void main(String[] args) {
        
        String original="abcde  FGHIJ  ABC  abc  DEFG   ";
        String s1=original.toLowerCase();
        String s2=original.toUpperCase();
        String s3=original.trim();
        String s4=original.substring(2);
        String s5=original.substring(2, 9);
        String s6=original.replace('a', 'x');
        String s7=original.replace("abc", "xy");
        int i=original.indexOf("bc");
        int j=original.lastIndexOf("bc");
        int l=original.length();
                
        System.out.println("original         -> "+"-"+original+"-");
        System.out.println("toLowerCase()    -> "+"-"+s1+"-"); // formata para minusculo
        System.out.println("toUpperCase()    -> "+"-"+s2+"-"); // formata para maiusculo
        System.out.println("trim()           -> "+"-"+s3+"-"); // mantem a String original e elimina os espaços dos cantos
        System.out.println("substring(2)     -> "+"-"+s4+"-"); // imprime a string original a partir do endereço 2 que passamos da string
        System.out.println("substring(2,9)   -> "+"-"+s5+"-");//imprime a string original inicio 2 ate final 9 que foi os endereços que passamos 
        System.out.println("replace('a','x') -> "+"-"+s6+"-");// troca a por x ,nesse caso um char ''
        System.out.println("replace(abc,xy)  -> "+"-"+s7+"-");// nesse caso uma string ""  "abc" por "xy"
        System.out.println("indexOf(bc)      ->  "+"-"+i+"-");// quando ocorre a primeira vez o "abc"
        System.out.println("lastIndexOf(bc)  ->  "+"-"+j+"-");// quando ocorre a ultima vz do "abc"
        System.out.println("length()         ->  "+"-"+l+"-");// verifica quantidade de caracter
    }  

            
}
