/******************************************************************************

Exercicio 023

Crie um vetor de 7 números inteiros e escreva um programa que encontre o maior
número presente no vetor e exiba-o.

*******************************************************************************/

import java.util.Scanner;
public class Ex023
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int [] vet = new int [7];
	    int maior = 0;
	    
	    for (int i = 0; i < vet.length; i++){
	       System.out.println("Entre com o " + (i+1) + "º valor: "); 
	       vet [i] = ler.nextInt ();
	       
	       if ( vet[i] > maior) {
	           maior = vet[i];
	       }
	    }
	     System.out.println("O maior valor deste vetor é: " + maior++); 
	}
}
