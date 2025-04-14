/******************************************************************************
Exemplo Array - Entrada de Dados
*******************************************************************************/

import java.util.Scanner;
public class Array_Exemplo2
{
	public static void main(String[] args) {
		int[] numeros = new int [5];
		Scanner ler = new Scanner (System.in);
		
		//Entrada de Dados
		for (int i = 0; i < numeros.length; i++){
		    System.out.println("Digite o " + (i + 1) + "º  número: ");
		    numeros[i] = ler.nextInt ();
		}
		// Saída de Dados
		
		for (int i =0; i < numeros.length; i++){
		    System.out.println("O " + (i + 1) + "º número é: " + numeros[i]);
		}
	}
}