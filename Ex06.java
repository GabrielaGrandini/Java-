/******************************************************************************

Ex06 - Faça um algoritmo que receba um número
inteiro qualquer e mostre se ele é par ou impar.

*******************************************************************************/

import java.util.Scanner;
public class Ex06
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    Double n1; 
	    
	 System.out.println("Informe um número: ");
	 n1 = ler.nextDouble ();
	 
	 if (n1%2 == 1){
	     System.out.println("Seu número é ímpar");
	 } else {
	     System.out.println("Seu número é par");
	 }
	}
}
