/******************************************************************************

Exercicio 002
Faça um Programa que peça dois números e imprima a soma.

*******************************************************************************/

import java.util.Scanner; 
public class Ex002
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n1, n2,soma;
	    
		System.out.println("Entre com o 1º valor: ");
		n1 = ler.nextInt ();
		
		System.out.println("Entre com o 2º valor: ");
		n2 = ler.nextInt ();
		
		soma = n1 + n2;
		
		System.out.println("A soma destes números é: " + soma);
	}
}