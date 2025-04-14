/******************************************************************************

2 - Jogo de adivinhação com dificuldade
Crie um jogo de adivinhação onde o jogador escolhe a dificuldade (fácil: 1 a 10,
médio: 1 a 50, difícil: 1 a 100). O programa gera um número aleatório (pesquisar)
e o jogador tem 5 tentativas para acertar. A cada erro, o programa dá dicas: "maior" ou "menor".

*******************************************************************************/

import java.util.Random;
import java.util.Scanner;
public class Desafio2
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    Random gerador = new Random();
	    int opcao, tentativa=5, lon, pare;
	    
	    System.out.println(" === Jogo de adivinhação! === ");
	    System.out.println("Escolha o nível de dificuldade: ");
	    System.out.println("1) Fácil - 1 a 10");
	    System.out.println("2) Médio - 1 a 50");
	    System.out.println("3) Difícil - 1 a 100");
	    opcao = ler.nextInt ();
	    
	    if (opcao == 1){
	        pare = 10;
	    } else if (opcao == 2){
	        pare = 50;
	    } else if (opcao == 3){
	        pare = 100; 
	    } else {
	        System.out.println("Opção inválida! Você jogará no nível médio");
	        pare = 50;
	    }
	    
	    lon = gerador.nextInt(pare) + 1;
	    
	    for (int i = 1; i <= 5; i++){
	      System.out.println( i + " º tentativa: ");
	      tentativa = ler.nextInt ();
	         
	      if (tentativa == lon){
	        System.out.println( "Parabéns!! Você acertou!");
            break;
            } else if (tentativa < lon) {
                System.out.println ("Continue tentando...");
	            System.out.println ("Dica:  Seu número é MAIOR");
	       } else if (tentativa > lon) {
	            System.out.println ("Continue tentando...");
	            System.out.println ("Dica:  Seu número é MENOR");
	       } 
	           
	    }   
	    
	    if (tentativa != lon) {
	           System.out.println ("Que pena, suas chances acabaram... O número era: " + lon);
        } 
            
        ler.close();   
        
	}
}
