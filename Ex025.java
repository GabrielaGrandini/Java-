/******************************************************************************
Exercicio 025

Crie um vetor de 6 números inteiros e escreva um programa que inverta a ordem dos 
elementos do vetor. Exiba o vetor original e o vetor invertido.

*******************************************************************************/

import java.util.Scanner;
public class Ex025
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int [] vet = new int [6];
	    
	    for ( int i = 0; i < vet.length; i++){
	       System.out.print("Entre com o " + (i+1) + "º valor: ");
	       vet[i] = ler.nextInt ();
	    }
	    
	    System.out.println("Esta é a ordem inversa do vetor: ");
	    for (int i = vet.length - 1; i >= 0; i--){
	        System.out.print(vet[i] + ", ");
	    }
	    System.out.println("\nEsta é a ordem original do vetor: ");
		for (int i = 0; i < vet.length; i++){
		    System.out.print(vet[i] + ", ");
		}
	}
}
