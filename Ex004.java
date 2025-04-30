/******************************************************************************

Exercicio 004
Faça um Programa que converta metros para centímetros.

*******************************************************************************/

import java.util.Scanner;
public class Ex004

{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double metros, centimetros;
	    
		System.out.println("Entre com o valor em metros: ");
		metros = ler.nextDouble ();
		
		centimetros = metros * 100;
		
			System.out.println("O valor apresentado em metors, corresponde a: " + centimetros + " centímetros");
	}
}