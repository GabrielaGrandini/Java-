/******************************************************************************

Exercicio 010
Faça um Programa que peça dois números e imprima o maior deles.

*******************************************************************************/

import java.util.Scanner;
public class Ex010

{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n1, n2;
	    
		System.out.println("Entre com o 1º número: ");
		n1 = ler.nextInt ();
		System.out.println("Entre com o 2º número: ");
		n2 = ler.nextInt ();
		
		if (n1 > n2){
		    System.out.println("O primeiro número é maior: " + n1);
		} else if (n1 < n2){
		    System.out.println("O segundo número é maior: " + n2);
		} else {
		    System.out.println("Os dois são o mesmo número!: " + n1);
		}
	}
}