/******************************************************************************

Exercicio 011
Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

*******************************************************************************/

import java.util.Scanner;
public class Ex011
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double n;
	    
		System.out.println("Entre com um valor: ");
		n =  ler.nextDouble ();
		
		if ( n < 0 ){
		    System.out.println("Seu número é negativo!: " +n);
		} else if ( n > 0){
		    System.out.println("Seu número é positivo!: " +n);
		} else {
		    System.out.println("Seu número é 0!");
		}
		
	}
}