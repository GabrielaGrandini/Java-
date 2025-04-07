/******************************************************************************

30. Escreva um programa que pergunta um número ao usuário, e
mostre sua tabuada completa desse número (de 1 até 10).

*******************************************************************************/

import java.util.Scanner;
public class Ex30
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n, i = 1, t;
	    
		System.out.println("Insira o número da tabuada: ");
		n = ler.nextInt ();
		
		while (i <= 10){
		t = n * i;
		System.out.println( n + " X " + i + " = " + t);
		i++;
		 
		
		}
	}
}
