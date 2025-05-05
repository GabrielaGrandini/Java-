/******************************************************************************
Exercicio 024
Crie um vetor de 8 números inteiros e conte quantas vezes um número específico 
(que o usuário digitar) aparece no vetor.

*******************************************************************************/

import java.util.Scanner;
public class Ex024
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int [] vetor = new int [8];
	    int numero;
	    int repete = 0;
	    
	    for (int i = 0; i < vetor.length; i++){
	        System.out.print("Entre com o " + ( 1 + i ) + "º valor: ");
	        vetor[i] = ler.nextInt ();
	    }
	    
	    System.out.print("Digite o número específico: ");
	    numero = ler.nextInt();
	    
	    for (int i = 0; i < vetor.length; i++){
	    	  if (vetor[i] == numero){
	            repete++;
	        }
	     }
		System.out.print("O número " +numero+ " repete " + repete + " vezes");
	}
}