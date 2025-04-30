/******************************************************************************

Exercicio 013
Faça um Programa que leia três números e mostre o maior deles.

*******************************************************************************/

import java.util.Scanner;
public class Ex013
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n1, n2, n3;
	    
		System.out.println("Entre com o 1º número: ");
		n1 = ler.nextInt ();
		System.out.println("Entre com o 2º número: ");
		n2 = ler.nextInt ();
		System.out.println("Entre com o 3º número: ");
		n3 = ler.nextInt ();
		
		if ( n1> n2 && n1 > n3 ){
		    System.out.println("O 1º número é maior: " + n1);
		} else if ( n1 < n2 && n2 > n3){
		    System.out.println("O 2º número é maior: " + n2); 
		} else {
		     System.out.println("O 3º número é maior: " + n3);
		}
	}
}