/******************************************************************************

Exercicio 016
Faça um Programa que peça um número inteiro e determine se ele é par ou impar.

Dica: utilize o operador módulo (resto da divisão).

*******************************************************************************/

import java.util.Scanner;
public class Ex016
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n;
	    
	    System.out.println("Entre com um número: ");
	    n = ler.nextInt ();
	    
	    if (n%2 == 0){
	        System.out.println("Seu número é par!: " + n);
	    } else {
	        System.out.println("Seu número é ímpar!: " + n);
	    }
		
	}
}