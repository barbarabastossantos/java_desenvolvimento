/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbara.exercitandologica;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Versiculo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opc =-1;
        System.out.print("""
                       
                          Meu peregrino app   :} 
                            
                           Ola! Qual seu nome?
                         
                           """);
        String nome=sc.nextLine();
         
        System.out.printf("""
                           
                           Legal, %s estou muito feliz em ter voce aqui!!
                          Eu sou um  Peregrino
                            e estou aqui para acompanhar voce nessa jornada 
                                 e juntos vamos caminhar rumo a Cidade Celestial
                           Agora %s voce tambem sera um peregrino e vai enfrenta desafios , 
                           vai amadurecer  e sera  confrontado e  confortado nessa caminhada . 
                                 %s voce esta pronto? Entao vamos la !!!
                           
                           """,nome,nome,nome
     
        );
        System.out.println("       Digite : \n" +
"                               \n" +
"                               1 -> Se precisa de um Amigo.\n" +
"                               \" No caminho estreito dessa jornada muitas vezes\n" +
"                              o peregrino precisa de um amigo , digite 1 \"\n" +
"                               \n" +
"                               2 -> Se precisa de um Pastor.\n" +
"                           \" Ao longo da jornada para nao cair  no engano nem ficarmos confusos \n" +
"                              precisamos de um Pastor , digite 2.\"\n" +
"                               \n" +
"                               3 -> Se precisa de um Salvador.\n" +
"                               \" A feira da vaidade tenta seduzir os peregrinos  com suas delicias ,\n" +
"                              mas esse caminho leva a morte precisamos de um Salvador , digite 3.\"\n" +
"                                  \n" +
"                               4 -> Se precisa de um Juiz.\n" +
"                               \" Nessa caminhada nos deparamos com varios adversarios como o Gigante Desespero \n" +
"                                       ate o grande adverssrio Apoliao  \n" +
"                                        (personificacao do satanas no livro o peregrino) ,\n" +
"                              nesses casos o peregrino precisa de um Juiz , digite 4.\"\n" +
"                               \n" +
"                               5 -> Se precisa de um Consolado.\n" +
"                               \" Mas se o peregrino ja esta nas garras do Gigante despero,\n" +
"                              e se encontra trancado no Castelo da Duvida basta lembrar que \n" +
"                                todo peregrino recebe uma chave que iberta elae de qualquer prisao \n" +
"                              abrindo qualquer porta , digite 5.\"\n" +
"                               \n" +
"                               0 -> %s se voce chegou ate aqui e ja se sente encorajado ,\n" +
"                              entao digite 0 e ate a proxima.\n" +
"                               \n" +
"                               "+nome);
             opc =sc.nextInt();
        while(opc !=0){
          
            
            if(opc == 1){
                jesusAmigo();
            }else if(opc ==2){
                jesusPastor();
            }else if(opc ==3){
                jesusSalvador();
            }else if(opc ==4){
                jesusJuiz();
            }else if(opc ==5){
                jesusConsolador();
            }else if(opc ==0){
                System.out.println(nome+ " sua caminhada ainda e muito longa mas lembre-se voce nao esta so! Deus abencoe.\n SAINDO...");
            }else{
                System.out.println(" Ops!! "+nome+" , essa opcao e invalida.");
            }
              System.out.printf("""
                              
                               1 -> Se precisa de um Amigo.
                          
                               2 -> Se precisa de um Pastor.
                          
                               3 -> Se precisa de um Salvador.
                               
                               4 -> Se precisa de um Juiz.
                              
                               5 -> Se precisa de um Consolado.
                              
                               0 -> %s se voce chegou ate aqui e ja se sente encorajado ,
                              entao digite 0 e ate a proxima.
                               
                               """,nome); 
            opc =sc.nextInt();
            
            
        }
        
      sc.close();
        
    }
    
    public static void jesusAmigo(){
        System.out.println("1️ Jesus como Amigo\n" +
"\n" +
"Texto Biblico:\n" +
"\"Ninguem tem maior amor do que este: de dar alguem a sua vida pelos seus amigos.\" (Joao 15:13)\n" +
"\"Vinde a mim, todos os que estais cansados e sobrecarregados, e eu vos aliviarei.\" (Mateus 11:28)\n" +
"\"O Senhor esta perto de todos os que o invocam, de todos os que o invocam com sinceridade.\" (Salmos 145:18)\n" +
"\"Eis que estou convosco todos os dias, ate a consumacao dos seculos.\" (Mateus 28:20)\n" +
"\"Tu, Senhor, es o meu amigo; meu coracaoo confia em Ti, e nao serei abalado.\" (Salmos 16:8)\n" +
"\n" +
 
"Jesus é um amigo verdadeiro que nunca nos abandona, que nos ouve, que caminha conosco nas alegrias e nos momentos difíceis.");
        
        
        System.out.println(" ");
    }
    
    public static void jesusPastor(){
        System.out.println("2️ Jesus como Pastor/Cuidador\n" +
"\n" +
"Texto Biblico:\n" +
"\"O Senhor e o meu pastor, nada me faltara. Ele me faz repousar em pastos verdes e me conduz a aguas tranquilas.\" (Salmos 23:1-2)\n" +
"\"Eu sou o bom pastor; conheco as minhas ovelhas, e elas me conhecem.\" (João 10:14)\n" +
"\"Vinde a mim, todos os que estais cansados, e eu vos darei descanso.\" (Mateus 11:28)\n" +
"\"Como o pastor apascenta o seu rebanho, assim eu apascentarei as minhas ovelhas.\" (Ezequiel 34:12)\n" +
"\"Nao temas, porque eu sou contigo; nao te assombres, porque eu sou o teu Deus; eu te fortaleco, e te ajudo.\" (Isaias 41:10)\n" +
"\n" +

"Jesus cuida de nos com amor, nos guia pelo caminho certo e nos protege como um pastor protege suas ovelhas.");
        
        System.out.println(" ");
    }
    
    public static void jesusSalvador(){
        System.out.println("3️ Jesus como Salvador/Redentor\n" +
"\n" +
"Texto Biblico:\n" +
"\"Porque o Filho do Homem veio buscar e salvar o que se havia perdido.\" (Lucas 19:10)\n" +
"\"Ele mesmo levou em seu corpo os nossos pecados sobre o madeiro, para que mortos para os pecados, pudessemos viver para a justica; e pelas suas feridas fostes sarados.\" (1 Pedro 2:24)\n" +
"\"Pois Deus amou o mundo de tal maneira que deu o seu Filho unigenito, para que todo aquele que nele cre nao pereca, mas tenha a vida eterna.\" (Joao 3:16)\n" +
"\"Ele nos resgatou da maldicao da lei, fazendo-se maldicao por nos.\" (Galatas 3:13)\n" +
"\"O Senhor e o nosso juiz, o Senhor e o nosso legislador, o Senhor e o nosso rei; ele nos salvara.\" (Isaias 33:22)\n" +
"\n" +

"Jesus veio nos resgatar do pecado, trazendo perdao, libertacao e vida nova a todos que creem.");
        System.out.println(" ");
    }
    
    public static void jesusJuiz(){
        System.out.println("4️ Jesus como Juiz Justo\n" +
"\n" +
"Texto Biblico:\n" +
"\"Porque esta ordenado que os homens morram uma so vez, vindo depois disso o juizo.\" (Hebreus 9:27)\n" +
"\"E o Pai a ninguem julga, mas deu todo o julgamento ao Filho.\" (Joao 5:22)\n" +
"\"Ele julgara o mundo com justica, e os povos com equidade.\" (Salmos 98:9)\n" +
"\"Estai prontos, porque o Filho do Homem vira a hora em que nao penseis.\" (Lucas 12:40)\n" +
"\"Entao vi um grande trono branco e aquele que nele estava assentado, de cuja presenca fugiram a terra e o ceu, e nao se achou lugar para eles.\" (Apocalipse 20:11)\n" +
"\n" +

"Jesus é justo, estabelece a verdade e nos ensina a viver com integridade, lembrando que a justica de Deus e perfeita."); 
        System.out.println(" ");
    }
    
    public static void jesusConsolador(){
        System.out.println("5️ Jesus como Consolador e Guia\n" +
"\n" +
"Texto Biblico:\n" +
"\"Eu sou o caminho, a verdade e a vida; ninguem vem ao Pai senao por mim.\" (Joao 14:6)\n" +
"\"E o Espirito Santo, que o Pai enviara em meu nome, vos ensinara todas as coisas e vos fará lembrar de tudo quanto vos tenho dito.\" (Joao 14:26)\n" +
"\"O Senhor e meu guia e meu consolo; ainda que eu ande pelo vale da sombra da morte, nao temerei mal algum.\" (Salmos 23:4)\n" +
"\"Confia no Senhor de todo o teu coracao, e nao te estribes no teu proprio entendimento; reconhece-o em todos os teus caminhos, e ele endireitara as tuas veredas.\" (Provérbios 3:5-6)\n" +
"\"O Senhor e bom, e fortaleza no dia da angustia e conhece os que nele confiam.\" (Naum 1:7)\n" +
"\n" +

"Jesus nos consola, nos guia em momentos de medo e duvida, e nos mostra o caminho para a vida plena e segura.");
        System.out.println(" ");
    }
}
