/******************************************************************************
 * 
Exercicio 006
Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre
a temperatura em graus Celsius. C = (5 * (F-32) / 9).

*******************************************************************************/

import java.util.Scanner;
public class Ex006
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double far, cel;
	    
		System.out.println("Entre com a sua temperatura em Farenheit: ");
		far = ler.nextDouble ();
		
		cel = (far - 32) * 5/9;
		
		System.out.println("O valor da sua temperatura em Celsius é: " + cel);	
		
	}
}